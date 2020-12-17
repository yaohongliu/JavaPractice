package scanner;

import java.util.Arrays;
import java.util.Scanner;

public class ReadArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" Element");
		int arr[] = new int[n];
		for(int i = 0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before sorting: ");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array after sort: ");
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}

}
