package assignment3;

public class AssignmentPalindrome {

	public static void main(String[] args) {
		System.out.println("All the Palindrome number between 1000 to 9999 are: ");
		for(int i = 1000; i<=9999;i++) {
			String s = i+"";//convert primitive veriable to string 
//initial StringBuffer with s and reverse it then convert to string 
			//and then compare if reversed string equals to the original string
			if(new StringBuffer(s).reverse().toString().equals(s))
				System.out.print(i+" ");
		}
	}

}
