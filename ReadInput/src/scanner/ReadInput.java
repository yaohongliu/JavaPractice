package scanner;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e2 = new Employee();
		
		System.out.println("Enter your name");
		String name = "yummy";
		e2.setName(sc.nextLine());	
		//String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your contact");
		long contact = sc.nextLong();
		System.out.println("Enter your gender");
		char gender = sc.next().charAt(0);
		System.out.println("Hello "+name);
		System.out.println("Age "+age);
		System.out.println("Contact "+contact);
		System.out.println("Gender "+gender);
		sc.close();
	
		Employee e1 = new Employee(age,name,contact, gender);
		System.out.println("printing employee...");
		System.out.println(e1);
		System.out.println(e1.toString());
		
		System.out.println("e2 = "+e2);
	}

}
