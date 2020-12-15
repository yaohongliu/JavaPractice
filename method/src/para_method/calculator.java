package para_method;

public class calculator {

	public static void main(String[] args) {
		parameter cal = new parameter();
		int result = cal.add(100,  22);
		System.out.println("result : "+result);
		System.out.println("result is : "+cal.add(67,77));
		int x = 99;
		int m = 44;
		System.out.println("result is : "+ cal.add(x, m));
		cal.multiply(x,77);
		
		System.out.println(cal.isEvenNumber(99));
		System.out.println(cal.isEvenNumber(72));
		

	}

}
