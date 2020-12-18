package inheritance1;

public class Mobile3 extends Mobile2 {
	public void socialApp() {
		System.out.println("Social app from v2");
	}
	
	//override
	@Override
	public void displayMenu() {
		
		System.out.println("Menu in mobile 3");
	}
}
// you can't overrode static methods, constructors, final methods and private of 
//parent to perform override there should be parent and child relationship'