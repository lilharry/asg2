package assignment02;

import java.util.HashSet;
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
			if (!p.compareTo(e.getPerson())){
				return true;
			}
		}
		return False;
	}
	public boolean isEmployeeId(int id) {
		for (Employee e : employees){
			if (e.getEmployeeId() == id){
				return true;
			}
		}
		return False;
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

	public static void main(String[] args) {
		EmployeeDataBase db = getEmployeeDataBase();
		for(var e : db.employees) System.out.println(e);
	}	
}


