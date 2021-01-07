package extending_thread_class;

public class Thread1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t = Thread.currentThread();
		t.setName("myMain");
		t.setPriority(8);
		System.out.println(Thread.currentThread());
		
		MyThread m1 = new MyThread();
		m1.setName("my_1");
		MyThread m2 = new MyThread();
		m2.setName("my_2");
		MyThread m3 = new MyThread();
		m3.setName("my_3");
		MyThread m4 = new MyThread();
		m4.setName("my_4");
		MyThread m5 =new  MyThread();
		m5.setName("my_5");
		
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		
		for(int i = 0; i< 4; i++)
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
