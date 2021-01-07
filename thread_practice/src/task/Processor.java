package task;

import java.util.LinkedList;
import java.util.Random;

/*
 *  producer-consumer problem:
 *  if we have a shared resource among 2 threads, and producer's job is to generate the data 
 *  and put it in the buffer and consumer's job is to take the data from the buffer. BUT producer 
 *  has produced the data more than the buffer size (overflow) or consumer consume all the data in the
 *   buffer(underflow)
 */
public class Processor {

	LinkedList<Integer> list = new LinkedList<>();
	Object lock = new Object();
	int value = 0;
	
	public void produce() throws InterruptedException{
		while(true)
		{
			synchronized(lock){
				while(list.size()==10)
					lock.wait();
				
				list.add(value++);
				lock.notify();
			}
		}
	}
	
	public void consume() throws InterruptedException{
		
		Random random = new Random();
		while(true)
		{
			synchronized(lock) {
				while(list.size() == 0)
					lock.wait();
				int i = list.removeFirst();
				lock.notify();
				System.out.println("Got the value "+i +" now the list size is "+ list.size());
			
			}
			Thread.sleep(random.nextInt(1000));
		}
		
		
		
		
	}
}
