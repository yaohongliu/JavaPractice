package constructotsExample;

public class calculatorMain {

	public static void main(String[] args) {
		calculator cal1 = new calculator("melody");
		calculator cal2 = new calculator (2);
		calculator cal3 = new calculator(10,20);
		calculator cal4 = new calculator(30,50);
		System.out.println("result of cal3 is "+cal3.add());
		System.out.println("result of cal1 is "+cal1.add());
		System.out.println("result of cal2 is "+cal2.add());
		System.out.println("result of cal3 is "+cal3.multiply());
		System.out.println("result of cal4 is "+cal4.multiply());
		System.out.println("result of cal4 is "+cal4.add());
	}
	

}
