package Example1;

public class product {
	String name;//global instance varilable 
	double price;//global instance variable
	static float discount = 5.5f;//global class level variable
	
	
	public static void main(String[] args) {
		product p1 = new product();
		p1.name = "Television";
		p1.price = 67.889;
		System.out.println("printing p1: ");
		p1.printProduct();
		
		discount = 3.89f;
		product p2 = new product();
		p2.name = "washmachine";
		//p2.price = 123.45;
		System.out.println("printing p2: ");
		p2.printProduct();
		
	}
	public void printProduct() {
		System.out.println("product name"+name);
		System.out.println("product price"+price);
		System.out.println("discount "+discount);
	}

}
