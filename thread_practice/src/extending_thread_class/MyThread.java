package extending_thread_class;

public class MyThread extends Thread {

	@Override
	public void run() {
		//System.out.println(Thread.currentThread());
		
		//System.out.println("Printing from Thread"+Thread.currentThread().getName()+" ID is: "+Thread.currentThread().getId());
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Printing from thread "+Thread.currentThread().getName()+" value of i = " + (i+1));
			try {
				Thread.sleep(1500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
