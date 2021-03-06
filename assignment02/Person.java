package assignment02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;
	private String ssn;
	private LocalDate dateOfBirth;
	private List<String> credentials = new ArrayList<>();

	public Person(String fName, String lName, String id, LocalDate dob) {
		firstName = fName;
		lastName = lName;
		ssn = id;
		dateOfBirth = dob;
	}

	public String name() { return lastName + ", " + firstName; }

	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getSsn() { return ssn; }
	public LocalDate getDateOfBirth() {return dateOfBirth;}
	public List<String> getCredentials() {return credentials;}

	public String toString() {
		return name() + ", id: " + ssn; 
	}

	public boolean add(String e) {
		return credentials.add(e);
	}

	public String remove(int index) {
		return credentials.remove(index);
	}

	public int compareTo(Person person) {
		return (lastName+firstName).compareToIgnoreCase(person.lastName+person.firstName);
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " (" + ssn.substring(0, 3) 
		+ "-" + ssn.substring(3, 5) + "-" + ssn.substring(5, 9) + ", " 
		+ dateOfBirth + "), credentials = " + credentials;
	}
}
