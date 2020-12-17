package stringPractice;

public class wrapperExample {

	public static void main(String[] args) {
		Integer i1=10;
		Integer i2=10;
		Integer i3= new Integer(10);
		System.out.println("i1==i2 "+ (i1==i2));
		System.out.println("i1==i3 "+(i1==i3));
		
		System.out.println("i1.equals(i3) "+(i1.equals(i3)));
		System.out.println("i1.queals(i2) "+(i1.equals(i2)));
		
		int x = i1;
		System.out.println(" x= "+x);
		x = 1000;
		i1=x;
		System.out.println("i1 = "+i1);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//java reads everything as String and writes everything as String
		String s = "33";
		int age = Integer.parseInt(s);//similar method in all other Wrapper classes except Character
		System.out.println("age = "+age);
		
		age = 99;
		s = age +"";
		System.out.println(" s = "+s);
		Integer i5 = 1000;
		s=i5.toString();
		System.out.println(" s = "+s);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		
		
		//"compareTo" if first object is greater than the second the return +1 if the same return 0 else return -1
		System.out.println("i5 = "+i5);
		System.out.println("i5.compareTo(1000) "+i5.compareTo(1000));
		System.out.println("i5.compareTo(2000) "+i5.compareTo(2000));
		System.out.println("i5.compareTo(100) "+i5.compareTo(100));
		
		Double d = 2.34;
		int f = d.intValue();
		System.out.println("f = "+f);

}
