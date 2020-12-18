package abstraction;

public class EMSMain {
	
	public static void main(String[] args) {
		System.out.println("AbcEmployee ");
		EMS ems= new AbcEmployees();
		ems.addEmployee();
		ems.calEmployeeSalary();
		ems.updateEmployee();
		ems.commonEmployeeBenifits();
		ems.searchEmployee();
		ems.removeEmployee();
		
		System.out.println("Xyz Employee: ");
		EMS ems1= new XyzEmployee();
		ems1.addEmployee();
		ems1.calEmployeeSalary();
		ems1.updateEmployee();
		ems1.commonEmployeeBenifits();
		ems1.searchEmployee();
		ems1.removeEmployee();
		
		
		
	}

}
