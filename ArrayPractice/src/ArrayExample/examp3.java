package ArrayExample;

public class examp3 {
	public static void main(String[] args) {
		int arr[] = {12,12,23,3,45,67,86,5,6,45};
		System.out.println("array element is :");
		for(int i = 0; i <arr.length; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		System.out.println("array prime element is :");
		for(int i = 0; i <arr.length; i++) {
			if(isPrime(arr[i]))
			System.out.println("arr["+i+"]: "+arr[i]);
		}
	}
	public static boolean isPrime(int n) {
		boolean b = false;
		int c = 0;
		for(int i = 0; i <= n; i++) {
			if(n % i == 0 ) {
				c++;
			}
		}
			if(c == 2) {
				b = true;
			}

		return b;
	}
	

}
/*
 * print array in reverse order
 * delete specific element from an array
 * find all the ven number and put it in a new array and also find all odd numbers and pitit in another array
 *find the sum all even and odd number separetely and print the max out of it
 *find the minimum and miximum elemnt in an array
 *find all palindrome numbers in a array
*/