import java.time.LocalDate;

public class Person {
	
	int personId;
	String firstName;
	String lastName;
	LocalDate birthDate;
	
	public Person(int personId, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
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
