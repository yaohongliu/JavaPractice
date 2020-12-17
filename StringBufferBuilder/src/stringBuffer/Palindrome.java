package stringBuffer;

public class Palindrome {

	public static void main(String[] args) {
		String s ="madam";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String s1=sb.toString();
		if(s.equals(s1)) {
			System.out.println("yes, it is palindrome");
		}
		else
			System.out.println("no, it is not palindrome");
		
		int num = 100;
		s = num+"";
		System.out.println("s = "+s);

		if(new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println("yes, it is palindrome");
		}
		else
			System.out.println("no, it is not palidrome");
		
		
		
	}

}
//task: print all palindrome between 100 to 9999 with the above style