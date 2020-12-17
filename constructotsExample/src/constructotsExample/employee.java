package constructotsExample;

public class employee {
	private int id;
	private String name;
	private long contact;
	private String city;
	public employee() {
		// TODO Auto-generated constructor stub
	}
	public employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public employee(int id, String name, long contact, String city) {
		this(id,name);//constructor chaining which you can only chain 1 constructor and in first line only
		this.contact = contact;
		this.city = city;
	}
	
	public void printEmployee() {
		System.out.println(" ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Contact: "+contact);
		System.out.println("City: "+city);
	}
	
}
