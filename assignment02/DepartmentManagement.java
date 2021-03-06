package assignment02;

public abstract class DepartmentManagement {

	//map department name to employee head
	private Map<String, Collection<Employee>> departmentHeads = new TreeMap<>();

	//map department name to employees in department
	private Map<String, Collection<Employee>> departmentEmployees = new TreeMap<>();
	
	//map department name to divisions in department
	private Map<String, Collection<String>> departmentDivisions = new TreeMap<>();

	// only for DepartmentManagement :

	public void addDepartment(String title) {
		if(!departmentHeads.containsKey(title)){
			//add department
			departmentHeads.put(title, new TreeSet<>());
			departmentEmployees.put(title, new TreeSet<>());
			departmentDivisions.put(title, new TreeSet<>());
		}
	}
	
	// add head to department
	public void addHead(String title, Employee head) {
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
	
}
