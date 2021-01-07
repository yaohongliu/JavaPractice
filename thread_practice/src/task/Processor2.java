package task;

import java.util.Scanner;

public class Processor2 {

	public void producer() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer started Producing");
			wait();// we should always use wait in while() loop not in if block
			//release the lock at wait() line whereas in consumer() sleeping 3s
			System.out.println("Resumed");
		}
		
	}
	
	public void consumer() throws InterruptedException{
		Thread.sleep(3000);
		Scanner sc = new Scanner(System.in);
		synchronized (this) {
			System.out.println("Enter Any Key to Continue");
			sc.nextLine();
			notify();//notify other thread to get the lock
			//notifyAll();
    // if there are more than 2 threads are in program we will use notifyAll()
		}	
	}
}