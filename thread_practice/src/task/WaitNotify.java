package task;

public class WaitNotify {

	public static void main(String[] args) {
		
		Processor2 process = new Processor2();
		
		Thread t1 = new Thread(new MyRunnable() {
			@Override
			public void run() {
				try {
					process.producer();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		});

		Thread t2 = new Thread(new MyRunnable() {
			@Override
			public void run() {
				try {
					process.consumer();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		t1.start();
		t2.start();
		
		
	}

}
