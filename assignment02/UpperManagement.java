package assignment02;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public abstract class UpperManagement { // this is an abstract product
	private Map<String, Collection<Employee>> listing = new TreeMap<>();
	
	// only for UpperManagement :
	private Collection<Person> boardMembers = new TreeSet<>();
	public void addBoardMember(Person person) {
		boardMembers.add(person);
	}
	
	// concrete subclasses actually create the titles
	public void addJobTitle(String title) {
		if(!listing.containsKey(title))
			listing.put(title, new TreeSet<>());
	}
	
	public void addEmployeeToRole(String jobTitle, Employee emp) {
		if(!listing.containsKey(jobTitle))
			throw new IllegalArgumentException("This Job Title does not exist");
		listing.get(jobTitle).add(emp);
	}

	public void addEmployeeToRoleUsingId(String jobTitle, int empId) {
		if(!listing.containsKey(jobTitle))
			throw new IllegalArgumentException("This Job Title does not exist");
		EmployeeDataBase db = EmployeeDataBase.getEmployeeDataBase(); 
		if(db.isEmployeeId(empId))
			listing.get(jobTitle).add(db.getFromId(empId));
	}
	public Map<String, Collection<Employee>> getListing () {
  		return listing;
 	}
}
