package Assignment;

public class secondDay {
	/*
	 * This is the second day assignment from Revature traning program
	 * @date 12/15/2020
	 * @author Yaohong Sabotinova
	 * method which generates odd numbers between the range
	 * method which generates Fibonacci 
	 * method which checks if the given value is Palindrome or not
	 */
		public static void main(String[] args){
			System.out.println("fibonacci result is: "+fib(7));
			oddNum(50);
			System.out.println();
			System.out.print("is the following value is palindrome? ");
			System.out.println(isPalindrome("123321"));
		}
		public static int fib(int n ){
			if(n<=1)
				return n;
			
			return fib(n-1) + fib(n-2);
		}
		public static void oddNum(int n)
		{
			System.out.println("The odd number in range "+n+" is: ");
			for(int i = 0; i <n; i++)
			{
				if(i%2 != 0)
					System.out.print(i+" ");
			}
		}
		public static boolean isPalindrome(String s)
		{
			boolean b = false;
			int i = 0, j = s.length()-1;
			while(i <j) {
				if(s.charAt(i)==s.charAt(j))
					b= true;
				i++;
				j--;
			}
			return b;
		}


}
