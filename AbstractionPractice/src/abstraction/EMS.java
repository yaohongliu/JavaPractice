package abstraction;

public  abstract class EMS{//can only extend one class

	public abstract void addEmployee();
	
	public abstract void updateEmployee();
	
	public abstract void calEmployeeSalary();
	
	public abstract void searchEmployee();
	
	public abstract void removeEmployee();
	
	public void commonEmployeeBenifits() {
		System.out.println("Common across all the Employee ");
		
	}
	
	//void hello();//default and abstract class
	
	
	
	
	
}
