package keyword;

public class Main {

	public static void main(String[] args) {
		
		Project p1 = new Project(9000,"abs ", "abcej client");
		Employee e1 = new Employee(100, "Melody", "Manager", 23455.56,p1);
		System.out.println(e1);
		
		Employee e2 = new Employee(200, "Melody", "Manager", 43455.56,p1);
		System.out.println(e2);
		
		Project p2 = new Project(9200,"absdf ", "abcejsf  client");
		Employee e3 = new Employee(300, "Melody", "Manager", 89455.56,p2);
		System.out.println(e3);
	}

}
