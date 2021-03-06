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
		if(!departmentHeads.containsKey(title))
			throw new IllegalArgumentException("This department title does not exist");
		departmentHeads.get(title).add(head);
	}
	
	public void addEmployeeToDepartment(String title, Employee emp) {
		if(!departmentHeads.containsKey(title))
			throw new IllegalArgumentException("This department title does not exist");
		departmentEmployees.get(title).add(emp);
	}

	public void addEmployeeToDepartmentUsingId(String title, int empId) {
		if(!departmentHeads.containsKey(title))
			throw new IllegalArgumentException("This department title does not exist");
		EmployeeDataBase db = EmployeeDataBase.getEmployeeDataBase(); 
		if(db.isEmployeeId(empId))
			departmentEmployees.get(title).add(db.getFromId(empId));

	}

	public void addDivisionToDepartment(String dep, String div) {
		if(!departmentHeads.containsKey(title))
			throw new IllegalArgumentException("This department title does not exist");
		departmentDivisions.get(dep).add(div);
	}


	
}
