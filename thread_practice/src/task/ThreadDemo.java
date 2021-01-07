package task;

import extending_thread_class.MyThread;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThreadDemo t1 = new MyThreadDemo();
		MyThreadDemo t2 = new MyThreadDemo();
		
		t1.start(); //implicitly call the run() of the Thread class, only run MyThread class thread
		t2.start();
		t1.run(); // run while the thread will run, it will start Main Thread
		//t2.run();
	}

}
