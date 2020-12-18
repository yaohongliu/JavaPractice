package interfaceExample2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("parent");
		
		Parent p = new Imple();
		p.parent1();
		p.parent2();
		p.parent3();
		
		System.out.println("child");
		
		Child c = new Imple();
		c.parent1();
		c.parent2();
		c.parent3();
		c.child1();
		c.child2();
		
		
	}

}
