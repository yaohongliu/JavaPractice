package interfaceExample1;

public class ImplementorMain {

	public static void main(String[] args) {
		System.out.println("Access implementor using MyInterface");
		MyInterface m1 = new Implementor();
		m1.method1();
		m1.method2();
		m1.method3();
		m1.method4();
		
		System.out.println("Access implementor using MyInterface");
		MyInterface2 m2 = new Implementor();
		m2.call1();
		m2.call2();
		m2.common();
		
		System.out.println("Access implementor using MyInterface");
		MyInterface2.InnerInterface i = new Implementor();
		i.inner1();
		i.inner2();
	}

}
