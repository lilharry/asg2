package assignment02;

public class AmazonOrganizationFactory extends CompanyFactory{
	private EmployeeDataBase database = EmployeeDataBase.getEmployeeDataBase();

	@Override
	public UpperManagement createUpperManagement(){
		return null;
	}
	
	@Override
	public DivisionManagement createDivisionManagement(){
		DivisionManagement returnValue = new AmazonDivisionManagement();
		for (String title : returnValue.getLeads().keySet()) {
			Employee emp = database.getNext();
			returnValue.addEmployeeToDivision(title, emp);
			emp.setJobDescription(title);
			emp.setWorkArea("Division Management");
		}
		return returnValue;
	}
	
	@Override
	public DepartmentManagement createDepartmentManagement(){
		DepartmentManagement returnValue = new AmazonDepartmentManagement();
		for (String title : returnValue.getDepartmentHeads().keySet()) {
			Employee emp = database.getNext();
			returnValue.addEmployeeToDepartment(title, emp);
			emp.setJobDescription(title);
			emp.setWorkArea("Department Management");
		}
		return returnValue;
	}
	
	@Override
	public Staff createStaff(String area){
		return null;
	}
	
	@Override
	public Workforce createWorkforce(){
		return null;
	}

}