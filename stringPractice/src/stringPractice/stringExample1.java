package stringPractice;

import java.util.Arrays;

public class stringExample1 {

	public static void main(String[] args) {
		
		String s1="hello";
		System.out.println("s1 = "+s1);
		System.out.println("s1.upperCase = "+s1.toUpperCase());
		System.out.println("s1 = "+s1);
		s1=s1.toUpperCase();
		System.out.println("s1 = "+s1);
		
		System.out.println("s1.length(): "+s1.length());
		System.out.println("s1.charAt(0): "+s1.charAt(0));
		
		System.out.println("s1.equals(\"HELLLO\"): "+s1.equals("HELLO"));
		System.out.println("s1.equals(\"HELLLo\"): "+s1.equals("HELLo"));
		
		System.out.println("s1.equalsIgnoreCase(\"HELLLO\"): "+s1.equals("HELLO"));
		System.out.println("s1.equalsIgnoreCase(\"HELLLo\"): "+s1.equals("HELLo"));
				
		System.out.println("s1.contains(\"o\"): "+s1.contains("HELLO"));
		System.out.println("s1.contains(\"LL\"): "+s1.contains("LL"));
		System.out.println("s1.contains(\"LOL\"): "+s1.contains("LOL"));
		
		char c[]=s1.toCharArray();
		System.out.println(Arrays.toString(c));
		
		System.out.println("s1.substring(2): "+s1.substring(2));
		System.out.println("s1.substring(2,4): "+s1.substring(2,4));
		
		System.out.println("s1.toLowerCase(): "+s1.toLowerCase());
		
		String s2 = "Hello good afternoon";
		String arr[] = s2.split(" ");
		for(int i = 0; i <arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		String s3="     hey     ";
		System.out.println(s3.trim());//take off white space
		
		System.out.println(s2.replace(" ","-"));
	}
	

}
