package interfaceExample1;

public class Implementor implements MyInterface, MyInterface2, MyInterface2.InnerInterface {//inheritance two classes

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1() of MyInterface x = "+MyInterface.x);
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2() of MyInterface x = "+MyInterface.x);
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3() of MyInterface x = "+MyInterface.x);
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("method4() of MyInterface x = "+MyInterface.x);
	}

	@Override
	public void call1() {
		// TODO Auto-generated method stub
		System.out.println("call1() of MyInterface x = "+MyInterface.x);
	}

	@Override
	public void call2() {
		// TODO Auto-generated method stub
		System.out.println("call2() of MyInterface x = "+MyInterface.x);
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("common() of MyInterface x = "+MyInterface.x);
	}

	@Override
	public void inner1() {
		// TODO Auto-generated method stub
		System.out.println("common() of MyInterface x = "+MyInterface.x);
	}

	@Override
	public void inner2() {
		// TODO Auto-generated method stub
		System.out.println("common() of MyInterface x = "+MyInterface.x);
	}
	
	
	
	
}
