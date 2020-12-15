package Cal01;

public class Sum {

	public static void main(String[] args) {
		System.out.println(sumOfInt(10,2,3,4,5));

	}
	public static int sumOfInt(int ...a) {// ...represents variable args
		//it take any number of values as input and it should be the last 
		//parameter of your method
		int sum = 0;
		for(int i:a) {
			sum=sum+i;
		}
		return sum;
	}
}
