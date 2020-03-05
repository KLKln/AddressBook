package model;
import javax.persistence.JoinColumn;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PersonID")
	private int personId;
	@Column(name="FirstName")
	private String firstName;
	@Column(name="LastName")
	private String lastName;
	@Column(name="DateOfBirth")
	private LocalDate birthDate;
/*
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	@JoinTable
		(
			name="Contact_Info",
		      joinColumns={ @JoinColumn(name="PersonID", referencedColumnName="PersonID") }
		)
	
	private List<ContactInfo> listOfContactInfo; */
	
	public Person(int personId, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	//to accept entry without ID
	public Person(String firstName, String lastName, LocalDate birthDate) {		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	//to accept entry without ID or knowing birthDate
	public Person(String firstName, String lastName) {		
		this.firstName = firstName;
		this.lastName = lastName;		
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + "]";
	}
	
	
	

}
