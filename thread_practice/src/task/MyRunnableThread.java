package task;

public class MyRunnableThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable());
		
		t1.run();
		t1.start();
		t2.start();
		
		Thread t3 = new Thread();
		t3.start();
		t1.start();
	}

}
