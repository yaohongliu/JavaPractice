package assignment3;
//Tasks day 3
/*@date 12/16/2020
 * @author Yaohong Sabotinova
*1)Print the array in reverse order
*2)Delete specific element from an array
*3)Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
*4)Find the sum of all even and odd numbers separately and print the max out of it.(max of sum of even vs odd)
*5)Find the minimum and the maximum element in an array
*6)Find all Palindrome numbers in an array 
*/
public class AssignmentArray {

	public static void main(String[] args) {
		int[] arr1 = {12,23,45,56,7,4,534,67};
		reverseArr(arr1);
		System.out.println();
		deleteElement(arr1,4);
		deleteElement(arr1,2);
		int[] arr2 = {12,23,45,56,7,4,534,67};
		findEvenOdd(arr2);
		findMaxOfEvenOdd(arr2);
		findSumOfEvenOdd(arr2);
		findMaxMin(arr2);
		int[] arr3= {12,23,44,56,124,12321,11,90};
		findPalindrome(arr3);
	}
	//Print the array in reverse order
	public static void reverseArr(int[] arr) {
		System.out.print("Reversed array elements are: ");
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
	//Delete specific element from an array
	public static void deleteElement(int[] arr, int n) {
		int len= arr.length;
		for(int i = n; i<len-1; i++) {
			arr[i]=arr[i+1];
		}
		len= len-1;
		System.out.print("Print the array after delete arr["+n+"]: ");
		for(int i = 0; i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//Find all the even numbers and put it in a new array and also find all odd numbers 
	//and put it in another array
	public static void findEvenOdd(int[] arr) {
		int even[] = new int[arr.length];
		int odd[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0)
				even[i]=arr[i];	
			else 
				odd[i]=arr[i];
		}
		System.out.print("even elements are: ");
		for(int i = 0; i <even.length; i++)	
			System.out.print(even[i]+" ");
		System.out.println();
		System.out.print("odd elements are: ");
		for(int i = 0; i<odd.length; i++)
			System.out.print(odd[i]+" ");
	}
	//Find the sum of all even and odd numbers separately 
	//and print the max out of it.(max of sum of even vs odd)
	public static void findMaxOfEvenOdd(int[] arr) {
		int even[] = new int[arr.length];
		int odd[] = new int[arr.length];
		int maxEven = 0, maxOdd = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0)
			{
				even[i]=arr[i];
				if(even[i]>maxEven)
					maxEven = even[i];
			}
					
			else {
				odd[i]=arr[i];
				if(odd[i]>maxOdd)
					maxOdd = odd[i];
			}
			
		}
		System.out.println();
		System.out.println("The max even element is: "+maxEven);
	
		System.out.println("The max odd element is: "+maxOdd);
	}
	//Find the sum of all even and odd numbers separately 
	//and print the max out of it.(max of sum of even vs odd)
	public static void findSumOfEvenOdd(int[] arr) {
		int even[] = new int[arr.length];
		int odd[] = new int[arr.length];
		int sumEven = 0, sumOdd = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0)
			{
				even[i]=arr[i];
				sumEven+=even[i];
			}
					
			else {
				odd[i]=arr[i];
				sumOdd+=odd[i];
			}
			
		}
		System.out.println();
		System.out.println("The sum even element is: "+sumEven);
	
		System.out.println("The sum odd element is: "+sumOdd);
	}
	//Find the minimum and the maximum element in an array
	public static void findMaxMin(int[] arr) {
		int max = 0, min = arr[0];
		for(int i = 0; i < arr.length; i++) {
				if(arr[i]>max)
					max = arr[i];
		}
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println();
		System.out.println("The max element is: "+max);
	
		System.out.println("The min element is: "+min);
	}
	//Find all Palindrome numbers in an array
	public static void findPalindrome(int[] arr) {
		System.out.print("Palindrome numbers are: ");
		for(int i = 0; i<arr.length; i++)
		{
			String s = arr[i]+"";//convert primitive veriable to string 
			if(new StringBuffer(s).reverse().toString().equals(s)) {//initial StringBuffer with s and reverse it
				//then convert to string and compare if reversed string equals to the original string
				System.out.print(arr[i]+" ");
			}		
		}
		
	}
	
}
