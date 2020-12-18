package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*1)Print the array in reverse order
*2)Delete specific element from an array
*3)Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
*4)Find the sum of all even and odd numbers separately and print the max out of it.(max of sum of even vs odd)
*5)Find the minimum and the maximum element in an array
*6)Find all Palindrome numbers in an array
*Solve the above problems with List
*/ 
public class ArrayProblemWithList {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(22);
		l.add(45);
		l.add(56);
		l.add(73);
		l.add(6);
		l.add(235);
		System.out.println("Printing the l: "+l);
		//1)print reserved array
		Collections.reverse(l);
		System.out.println("Printing reversed l: " +l);
		//2) Delete specific element from an array
		l.remove(2);
		System.out.println("Printing l after remove element in index 2: " +l);
		//3)find even and odd number in l
		List<Integer> leven = new ArrayList<Integer>();
		List<Integer> lodd = new ArrayList<Integer>();
		for(int i:l) {
			if(i%2==0)
				leven.add(i);
			else
				lodd.add(i);	
		}
		System.out.println("Even numbers in l are: "+leven);
		System.out.println("Odd numbers in l are: "+lodd);
		//4)find the sum of even and odd number in l
		int sumEven=0, sumOdd=0;
		for(int i:l) {
			if(i%2==0)
				sumEven+=i;
			else
				sumOdd+=i;
		}
		System.out.println("Sum of even number in l is "+sumEven);
		System.out.println("Sum of odd number in l is "+sumOdd);

		//5)find the min and max number in l
		Collections.sort(l);
		System.out.println("Min number in l is "+l.get(0));
		System.out.println("Max number in l is "+l.get(l.size()-1));
		//6)Find all Palindrome numbers in an array
		System.out.print("Palindromes in l are: ");
		for(int i:l) {
			String s = i+"";
			if(new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.print(i+", ");
			}
				
		}
	}

}
