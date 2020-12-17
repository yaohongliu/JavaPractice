package ArrayExample;

import java.util.Arrays;

public class arrayUnitClass {

	public static void main(String[] args) {
		int arr[] = {12,12,23,3,45,67,86,5,6,45};
		System.out.println("array element is :");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("print sorted array: ");
		System.out.println(Arrays.toString(arr));
		
		int arr1[]=Arrays.copyOf(arr, arr.length);
		System.out.println("arr1 = "+Arrays.toString(arr1));
		
		int arr2[]=new int[10];
		Arrays.fill(arr2,  999);;
		System.out.println(" arr2 = "+ Arrays.toString(arr2));
		
		/*binary research: goes by divide and conquer approach
		*prerequisite is the array must be sorted
		*1. starts from the mid postion, if mid element is matching then return true
		*2. if mid element greater than target then it do search on the greater side of mid element
		*3. else do search from smaller side of mid element
		*/
		System.out.println(Arrays.binarySearch(arr, 100));
		System.out.println(Arrays.binarySearch(arr, 12));
		//return the number of how many times you found this number, if there are duplicate
		//number then return finding the last the number 
	}

}
