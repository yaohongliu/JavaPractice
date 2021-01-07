package synch_eg;

public class Printer {
	
	public static void printPages(Pages page) {
		System.out.println(page.getPage1());
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" "+page.getPage2());
	}

}
//task1: recreate the same and get good understanding of the Thread flow using Runnable and Thread class
//task2: explore on internal-thread communication methods like wait(), notify(), notifyAll()
//task3: Go over Produce-Consumer problem and how they solve it using inter-thread communication.