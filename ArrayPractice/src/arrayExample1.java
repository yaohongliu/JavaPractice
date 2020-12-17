package arrayExample;

public class arrayExample1 {

	public static void main(String[] args) {
		int arr[] = {12,33,11,2,14,23};
		for(int i = 0; i <arr.length; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		System.out.println("\narr[0] = " +arr[0]);
		
		System.out.println("\narr[3] = " +arr[3]);
		
		System.out.println("\narray size is " +arr.length);
		
		
		//empty array
		int arr1[]=new int[10];
		System.out.println("printing contents of arr1: ");
		for(int x:arr1) {
			System.out.print(x+" ");
		}
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		arr1[3]=400;
		System.out.println();
		System.out.println("print arr1 before insertion");
		for(int i = 0; i <arr1.length; i++) {
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}
		System.out.println();
		int pos = 1;
		int ele =999;
		int n = 5;

		for(int i = n; i>=pos; i--) {
			arr1[i]=arr1[i-1];
		}
		arr1[pos-1]=ele;
		n++;
		System.out.println("print arr1 after insertion ");
		for(int i = 0; i <n; i++) {
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}
		//delete an element 
		int del=1;
		for(int i = del-1; i<n; i++) {
			arr1[i]=arr1[i+1];
		}
		n--;
		System.out.println("printing after delete");
		for(int i = 0; i <n; i++) {
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}
	}
}
