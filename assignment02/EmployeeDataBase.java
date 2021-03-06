package assignment02;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class EmployeeDataBase {
	private Set<Employee> employees = new HashSet<>();
	private static EmployeeDataBase database = new EmployeeDataBase();
	
	private EmployeeDataBase () {}
	
	public static EmployeeDataBase getEmployeeDataBase() {
		return database;
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	public boolean isEmployee(Person p) {
		for (Employee e : employees){
			if (p.compareTo(e.getPerson()) == 0){
				return true;
			}
		}
		return false;
	}
	public boolean isEmployeeId(int id) {
		for (Employee e : employees){
			if (e.getEmployeeId() == id){
				return true;
			}
		}
		return false;
	}
	public Employee getFromId(int id) {
		for (Employee e : employees){
			if (e.getEmployeeId() == id){
				return e;
			}
		}
		return null;
	}

	static { // populate database
		int numEmployees = 1000;
		int nextId = 111111;
		for(int i = 0; i < numEmployees; i++) {
			LocalDate d = NamesResource.getRandomBirthDate(
				LocalDate.now().getYear() - 60, LocalDate.now().getYear() - 20);
			nextId++;
			while(!BNumberValidator.isValid(nextId)) nextId++;
			Person p = new Person(NamesResource.getRandomLastName(), 
				NamesResource.getRandomFirstName(), NamesResource.getRandomID(), d);
			getEmployeeDataBase().employees.add(new Employee(p, "N/A", "N/A"));
		}
	}

	private Set<Employee> unassigned = new HashSet<>(); // added Friday
	 static { // populate database
	 	int numEmployees = 1000;
	 	int nextId = 111111;
	 	for(int i = 0; i < numEmployees; i++) {
	 		LocalDate d = NamesResource.getRandomBirthDate(
	 			LocalDate.now().getYear() - 60, LocalDate.now().getYear() - 20);
	 		nextId++;
	 		while(!BNumberValidator.isValid(nextId)) nextId++;
	 		Person p = new Person(NamesResource.getRandomLastName(), 
	 			NamesResource.getRandomFirstName(), NamesResource.getRandomID(), d);
	 		getEmployeeDataBase().employees.add(new Employee(p, "N/A", "N/A"));
	   getEmployeeDataBase().unassigned.add(new Employee(p, "N/A", "N/A")); // added Friday
	}
	}

	public Employee getNext() {
		Iterator<Employee> iter = unassigned.iterator();
		if(iter.hasNext()) {
			Employee next = iter.next();
			iter.remove();
			return next;
		}
  		throw new NoSuchElementException("No Employees left to assign");
	}

	public static void main(String[] args) {
		EmployeeDataBase db = getEmployeeDataBase();
		for(var e : db.employees) System.out.println(e);
	}
}


