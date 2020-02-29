package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Person;

public class PersonHelper {
	static EntityManagerFactory emfactory=  Persistence.createEntityManagerFactory("addressBook");
	
	public void insertPerson(Person p){
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Person>showAllPeople(){
		EntityManager em = emfactory.createEntityManager();
		List<Person> allPeople = em.createQuery("SELECT p from Person p").getResultList();
		return allPeople;
	}
	
	public Person searchForPersonById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Person found =  em.find(Person.class, idToEdit);
		em.close();
		return found;
	}
	
	public void updatePerson(Person toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Person> searchForPersonByFirstName(String firstName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Person> typedQuery = em.createQuery("select p from Person p where p.firstName = :selectedFirstName", Person.class);
		typedQuery.setParameter("selectedFirstName",  firstName);
		
		List<Person> found = typedQuery.getResultList();
		em.close();
		return found;
	}
	
	public List<Person> searchForPersonByLastName(String lastName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Person> typedQuery = em.createQuery("select p from Person p where p.lastName = :selectedLastName", Person.class);
		typedQuery.setParameter("selectedFirstName",  lastName);
		
		List<Person> found = typedQuery.getResultList();
		em.close();
		return found;
	}
	
	public void removePerson(Person toRemove) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Person> typedQuery = em.createQuery("select p from Person p where p.firstName = :selectedFirstName and p.lastName = :selectedLastName and p.birthDate = :selectedBirthDate", Person.class);
		
		typedQuery.setParameter("selectedFirstName", toRemove.getFirstName());
		typedQuery.setParameter("selectedLastName",	toRemove.getLastName());
		typedQuery.setParameter("selectedBirthDate", toRemove.getBirthDate());

		typedQuery.setMaxResults(1);
		
		Person result = typedQuery.getSingleResult();

		
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

}
