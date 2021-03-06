package assignment02;

public class Employee implements Comparable<Employee>{
	private Person person;
	private int employeeId;
	private Object workArea;
	private String jobDescription;
	private static int nextEmpID = 111111;

	public Employee(Person personIn, Object workAreaIn, String jobDescriptionIn) {
		person = personIn;
		workArea = workAreaIn;
		jobDescription = jobDescriptionIn;
		int id = nextEmpID++;
		while (!BNumberValidator.isValid(id)) {
			id = nextEmpID++;
		}
		employeeId = id;
	}

	public Person getPerson() {
		return person;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public Object getWorkArea() {
		return workArea;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setWorkArea(Object workArea) {
		this.workArea = workArea;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	
	@Override
	public int compareTo(Employee o) { 
		return this.person.compareTo(o.person);
	}

	@Override
	public String toString() {
		return workArea + ", " + jobDescription + "(" + employeeId + "): "
		+ person;
	}

}
