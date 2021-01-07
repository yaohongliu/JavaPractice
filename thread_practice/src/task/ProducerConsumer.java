package task;

public class ProducerConsumer {

	public static void main(String[] args) {
		Processor pro = new Processor();
		Thread t1 = new Thread(new MyRunnable() {

			@Override
			public void run() {
				try {
					pro.produce();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		
	});
		Thread t2 = new Thread(new MyRunnable() {

			@Override
			public void run() {
				try {
					pro.consume();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		t1.start();
		
		t2.start();
		

	}

}
