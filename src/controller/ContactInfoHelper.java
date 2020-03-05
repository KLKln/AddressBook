package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ContactInfo;
import model.Person;

public class ContactInfoHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("AddressBook");
	
	public void insertContactInfo(ContactInfo c){
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<ContactInfo>showAllContactInfo(){
		EntityManager em = emfactory.createEntityManager();
		List<ContactInfo> allContactInfo = em.createQuery("SELECT c from ContactInfo c").getResultList();
		return allContactInfo;
	}
	
	
	
	public void updateContactInfo(ContactInfo toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public ContactInfo searchForContactInfoByID(int personId) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ContactInfo> typedQuery = em.createQuery("select c from ContactInfo c where c.personId = :selectedPersonId", ContactInfo.class);
		typedQuery.setParameter("selectedPersonId",  personId);
		
		typedQuery.setMaxResults(1);
		ContactInfo found = typedQuery.getSingleResult();
		
		em.close();
		return found;
	}
	
		
	public void removeContactInfo(ContactInfo toRemove) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Person> typedQuery = em.createQuery("select p from Person p where p.phone = :selectedPhoneNumber and p.phoneType = :selectedPhoneType and p.email = :selectedEmail and p.emailType = :selectedEmailType", Person.class);
		
		typedQuery.setParameter("selectedPhoneNumber", toRemove.getPhoneNumber());
		typedQuery.setParameter("selectedPhoneType",	toRemove.getPhoneType());
		typedQuery.setParameter("selectedEmail", toRemove.getEmail());
		typedQuery.setParameter("selectedEmailType", toRemove.getEmailType());

		typedQuery.setMaxResults(1);
		
		Person result = typedQuery.getSingleResult();

		
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

}
