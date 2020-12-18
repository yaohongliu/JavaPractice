package exacpetionPractice;

public class Example1 {

	public static void main(String[] args) {
		int x = 10, y = 5, res = 0;
		res=x/y;
		
		try {
			//if(y<=0) {
			//	throws ArithmeticException();
			//}
			res=x/y;
			//System.out.println("result is: "+res);
			String s =null;
			System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero ");
		}catch(NullPointerException e) {
			System.out.println("something is null");
		}catch(Exception e) {
			System.out.println("unhandled");
		}finally {
			System.out.println("result is: "+res);
		}
		System.out.println("this is other LOC of this app");
	}

}
