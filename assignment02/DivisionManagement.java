package assignment02;

public abstract class DivisionManagement{	
	// map division name to division leads
	private Map<String, Collection<Person>> divisionLeads = new TreeMap<>();

	// map divsion name to division employees
	private Map<String, Collection<Employee>> divisionEmployees = new TreeMap<>();
	
	// only for Division Management:

	// add new divison
	public void addDivision(String title) {
		if(!divisionLeads.containsKey(title))
			divisionLeads.put(title, new TreeSet<>());
			divisionEmployees.put(title, new TreeSet<>());
	}
	
	// add new lead to division
	public void addLeads(String title, Person p) {
		if(!divisionLeads.containsKey(title))
			throw new IllegalArgumentException("This division name does not exist");
		divisionLeads.get(title).add(p);
	}
	
	// add new employee to division
	public void addEmployeeToDivision(String title, Employee emp) {
		if(!divisionLeads.containsKey(Title))
			throw new IllegalArgumentException("This division name does not exist");
		divisionEmployees.get(title).add(emp);
	}

	// add new employee to division using ID
	public void addEmployeeToDivisionUsingId(String title, int empId) {
		if(!divisionLeads.containsKey(title))
			throw new IllegalArgumentException("This division name does not exist");
		EmployeeDataBase db = EmployeeDataBase.getEmployeeDataBase(); 
		if(db.isEmployeeId(empId))
			divisionEmployees.get(title).add(db.getFromId(empId));
	}
	
	public Map<String, Collection<Employee>> getLeads () {
  		return divisionLeads;
 	}

 	public Map<String, Collection<Employee>> getDivisionEmployees () {
  		return divisionEmployees;
 	}
}
