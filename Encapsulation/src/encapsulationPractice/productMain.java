package encapsulationPractice;

public class productMain {

	public static void main(String[] args) {
		Product p1 = new Product(100,"TV", 123.33);
		System.out.println("printing p1: ");
		p1.printProduct();
		p1.setName("Television");
		
		System.out.println("Product name of p1 is "+p1.getName());

	}

}
