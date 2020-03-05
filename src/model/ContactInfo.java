package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactInfo")
public class ContactInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	int contactId;
	@Column(name = "PhoneType")
	int phoneNumber;
	@Column(name = "PhoneType")
	String phoneType;
	@Column(name = "Email")
	String email;
	@Column(name = "EmailType")
	String emailType;
	@Column(name = "PersonID")
	int personId;
	
	public ContactInfo(int contactId, int phoneNumber, String phoneType, String email, String emailType, int personId) {
		super();
		this.contactId = contactId;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.email = email;
		this.emailType = emailType;
		this.personId = personId;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailType() {
		return emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public ContactInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ContactInfo [contactId=" + contactId + ", phoneNumber=" + phoneNumber + ", phoneType=" + phoneType
				+ ", email=" + email + ", emailType=" + emailType + ", personId=" + personId + "]";
	}
	
	

}
