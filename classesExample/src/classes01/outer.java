package classes01;

public class outer{

	public void outerMethod() {
		innerPrivate i = new innerPrivate();
		i.helloInnerPrivate();

	}
	private class innerPrivate{
		public void helloInnerPrivate(){
			System.out.println("hello from inner private");
		}
	}
	public class innerPublic{
		public void helloInnerPublic(){
			System.out.println("hello from inner public");
		}
	}
	public static class innerStaticPublic{
			public static void helloInnerStaticPublic() {
				System.out.println("hi from inner public static");
			}
	}

}
// inner class can be private static protected and public as well
//if it is a non static inner class then it can have inner static methods in it
//and you need to create the object of outer class to access inner class and its method
//if it is static class then a static class can have both static as well as non static method
//so to access static methods as you don't need any and to access non static methods of a static 
//inner class you need object of only static inner class not of the outer class 