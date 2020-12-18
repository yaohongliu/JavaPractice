package iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorExample {

	public static void main(String[] args) {
		//remove all K,V pairs whose value is null or whose key is divisible by 10
		Map<Integer, String> hm = new HashMap<>();
		hm.put(100, "Java");//insert
		hm.put(100, "openjdk");//update
		hm.put(200, null);
		hm.put(300, "morning");
		hm.put(400, "close");
		hm.put(500, "open");
		hm.put(111, "close");
		System.out.println("Map before deletion");
		System.out.println("hm= "+hm);
		
		/*for(Entry<Integer,String> e : hm.entrySet()) {
			if(e.getValue()==null || e.getKey()%10==0) {
				hm.remove(e.getKey());
				
			}
		}*/
		//list.iterator(), set.iterator(), queue.iterator()
		Iterator<Entry<Integer, String>> i = hm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String> e = i.next();//read and increment to use it only once in your loop
			if(e.getValue()==null || e.getKey()%10==0) {
				i.remove();
			}
		}
		
		System.out.println("Map after deletion");
		System.out.println("hm= "+hm);
	}

}
//Enumerator - read operation from top to bottom
//Iterator - read and remove operation from top to bottom(any collection)
//ListIterator - read, remove, add from any direction but it is only it is only used with list interface
