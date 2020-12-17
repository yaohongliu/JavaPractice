package constructotsExample;

public class employeeMain {

	public static void main(String[] args) {
		employee e1 = new employee(100, "melody");
		System.out.println("printing e1");
		e1.printEmployee();
		
		employee e2 = new employee(200, "Lily");
		System.out.println("printing e2");
		e2.printEmployee();

		employee e3 = new employee(200, "Lily", 987654321,"Austin");
		System.out.println("printing e3");
		e3.printEmployee();
	}

}
