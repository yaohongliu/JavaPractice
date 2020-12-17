package constructotsExample;

public class calculator {

	public calculator(String name) {
		System.out.println("hello "+name);
	}
	public calculator(int x) {
		System.out.println("x = "+x);
	}
	int a;
	int b;
	
	/*public calculator(int x,int y) {
		a = x;
		b = y;
	}*/
	
	public calculator(int a, int b) {
		this.a = a;//variable shadowing
		this.b = b;
	}
	public int add() {
		return a+b;
	}
	public int multiply() {
		return a*b;
	}
}
