package model;

import javax.persistence.Column;
import javax.persistence.Entity;
//<<<<<<< 97499ee1782564dd93471b2b1fe8bbbdf37b2ca2
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//=======
//>>>>>>> Made all the changes :)
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactInfo")
public class ContactInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	int contactId;
	@Column(name = "Phone")
	String phoneNumber;
	@Column(name = "Email")
	String email;
	@Column(name = "PersonID")
	int personId;
	
	public ContactInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactInfo(int contactId, String phoneNumber, String email, int personId) {
		super();
		this.contactId = contactId;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.personId = personId;
	}
	
	public ContactInfo(int contactId, String phoneNumber, String email) {
		super();
		this.contactId = contactId;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public ContactInfo(String phoneNumber, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	
/*<<<<<<< 97499ee1782564dd93471b2b1fe8bbbdf37b2ca2
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	int contactId;
	@Column(name = "Phone")
	String phoneNumber;
	@Column(name = "PhoneType")
	String phoneType;
	@Column(name = "Email")
	String email;
	@Column(name = "EmailType")
	String emailType;
	@Column(name = "PersonID")
	int personId;
	
	
	public ContactInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ContactInfo(int contactId, String phoneNumber, String phoneType, String email, String emailType) {
		super();
		this.contactId = contactId;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.email = email;
		this.emailType = emailType;
	}



	public ContactInfo(String phoneNumber, String phoneType, String email, String emailType) {
		super();
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.email = email;
		this.emailType = emailType;
	}



	public ContactInfo(int contactId, String phoneNumber, String phoneType, String email, String emailType, int personId) {
//=======
	@Column(name = "ID")
	int ID;
	@Column(name = "Phone")
	String phone;
	@Column(name = "Email")
	String email;

	public ContactInfo() {
//>>>>>>> Made all the changes :)
		super();
	}
	

<<<<<<< 97499ee1782564dd93471b2b1fe8bbbdf37b2ca2
	@Override
	public String toString() {
		return "ContactInfo [contactId=" + contactId + ", phoneNumber=" + phoneNumber + ", phoneType=" + phoneType
				+ ", email=" + email + ", emailType=" + emailType + ", personId=" + personId + "]";
	}
	
	public int getContactId() {
		return contactId;
=======
	public ContactInfo(int iD, String phone) {
		super();
		ID = iD;
		this.phone = phone;
>>>>>>> Made all the changes :)
	}


<<<<<<< 97499ee1782564dd93471b2b1fe8bbbdf37b2ca2
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
=======
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
>>>>>>> Made all the changes :)
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< 97499ee1782564dd93471b2b1fe8bbbdf37b2ca2
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


=======
//>>>>>>> Made all the changes :)*/
	
	
	
	
}
