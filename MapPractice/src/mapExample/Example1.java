package mapExample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Example1 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(100, "Java");//insert
		hm.put(100, "openjdk");//update
		hm.put(200, "openjdk");
		hm.put(300, null);
		hm.put(400, "close");
		hm.put(null, "open");
		hm.put(100, "close");
		System.out.println("hm= "+hm);

		
		Map<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(100, "Java");//insert
		lhm.put(100, "openjdk");//update
		lhm.put(200, "openjdk");
		lhm.put(300, null);
		lhm.put(400, "close");
		lhm.put(null, "open");
		lhm.put(100, "close");
		System.out.println("lhm= "+lhm);
		
		
		//Map<Integer, String> thm = new TreeMap<>();
		Map<Integer, String> thm = new TreeMap<>(Collections.reverseOrder());
		thm.put(100, "Java");//insert
		thm.put(100, "openjdk");//update
		thm.put(200, "openjdk");
		thm.put(300, null);
		thm.put(400, "close");
		//thm.put(null, "open");
		thm.put(100, "close");
		System.out.println("thm= "+thm);
		
		
		Map<Integer, String> ht = new Hashtable<>();
		ht.put(100, "Java");//insert
		ht.put(100, "openjdk");//update
		ht.put(200, "openjdk");
		//ht.put(300, null);
		ht.put(400, "close");
		//ht.put(null, "open");
		ht.put(100, "close");
		System.out.println("ht= "+ht);
		
		System.out.println("ht size is: "+ht.size());
		System.out.println("ht contails key 100 : "+ht.containsKey(100));
		System.out.println("ht contails key 101 : "+ht.containsKey(101));
		System.out.println("ht contails value 100 : "+ht.containsValue("close"));
		System.out.println("ht contails value 100 : "+ht.containsValue("j"));
		System.out.println("ht get 100 : "+ht.get(100));
		System.out.println("ht get 100 : "+ht.get(110));
		ht.remove(100);
		System.out.println("after remove 100: "+ht);
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		Set<Integer> hs=ht.keySet();
		System.out.println("ht.keySet()");
		for(Integer i :hs) {
			System.out.println("Key: "+i+" value: "+ ht.get(i));
		}
		System.out.println("entrySet");
		for(Entry<Integer,String>e :ht.entrySet()) {
			System.out.println("Key: "+e.getKey()+" value: "+e.getValue());
		}
		
		
		
		
	}

}
