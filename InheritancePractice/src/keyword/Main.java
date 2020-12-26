package keyword;

public class Main {

	public static void main(String[] args) {
		
		Project p1 = new Project(9000,"abc Corp ", "abc client");
		Employee e1 = new Employee(100, "Melody", "Associate", 23455.56,p1);
		System.out.println("e1: "+e1);
		
		Employee e2 = new Employee(200, "Sally", "Manager", 43455.56,p1);
		System.out.println("e2: "+e2);
		
		Project p2 = new Project(9200,"xyz Corp ", "xyz  client");
		Employee e3 = new Employee(300, "Melody", "Manager", 89455.56,p2);
		System.out.println("e3: "+e3);
		//System.out.println(e3);
		
		Team t1 = new Team(10001, "Allie", "Mike");
		Team t2= new Team(10002, "Cody", "Jake");
		System.out.println("t1: "+t1);
		System.out.println("t2: "+t2);
		
		Player pl01 = new Player(8,t1);
		Player pl02 = new Player(4,t2);
		System.out.println("pl01: " + pl01);
		System.out.println("pl02: " + pl02);
		
		Address a1 = new Address(1102, "Dc street","Austin", 45663);
		Address a2 = new Address(1103, "2nd street","Austin", 45343);
		Address a3 = new Address(1104, "3rd street","Austin", 41233);
		
		System.out.println("a1: "+a1);
		System.out.println("a2: "+a2);
		System.out.println("a3: "+a3);
	}

}
//complete address, player and team