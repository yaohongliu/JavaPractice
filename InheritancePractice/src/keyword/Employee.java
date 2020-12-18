package keyword;

public class Employee extends Person{
	private String designation;
	private double salary;
	
	private Project project;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String designation, double salary, Project project) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
		this.project = project;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emppoyee [designation=" +designation+", salary = " +salary+", project=" +project +", toString " +super.toString()+ "]";
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
}
