package assignment02;

public abstract class CompanyFactory {
	public abstract UpperManagement createUpperManagement();
	public abstract DivisionManagement createDivisionManagement();
	public abstract DepartmentManagement createDepartmentManagement();
	public abstract Staff createStaff(String area);
	public abstract Workforce createWorkforce();	
}
