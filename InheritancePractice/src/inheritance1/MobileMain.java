package inheritance1;

public class MobileMain {

	public static void main(String[] args) {
		Mobile3 m3 = new Mobile3();// when compiler generate the new object, it will generate hashcode for it too
		System.out.println("Accessing props using mobile 3");
		m3.socialApp();
		m3.browsing();
		m3.gaming();
		m3.calling();
		m3.message();
		System.out.println(m3.getClass());
		System.out.println(m3.hashCode());
		m3.displayMenu();
	}

}
