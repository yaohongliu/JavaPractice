package task;

public class MyThreadDemo extends Thread {

	public void run() {
		for( int i = 0; i < 10; i++)
		{
			System.out.println("Printing from thread "+Thread.currentThread().getName()+" value of i = " + (i+1));
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
