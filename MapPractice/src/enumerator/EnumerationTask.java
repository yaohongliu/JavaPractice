package enumerator;

import java.util.Collections;
//Enumerator - read operation from top to bottom
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class EnumerationTask {

	public static void main(String[] args) {
		
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
		
		Enumeration<Integer> ek = Collections.enumeration(hm.keySet());
		//Enumeration<String> ev = Collections.enumeration(hm.get(ek));
		System.out.print("Using Enumeration to print the key values in hashMap hm: ");
		while(ek.hasMoreElements()) {
		       System.out.print(ek.nextElement()+" ");
		}
		System.out.println();
		Enumeration week;
		Vector weekNum = new Vector();
		weekNum.add("Monday");
		weekNum.add("Tuesday");
		weekNum.add("Wenesday");
		weekNum.add("Thursday");
		weekNum.add("Friday");
		weekNum.add("Saturday");
		weekNum.add("Sunday");
		week = weekNum.elements();
		System.out.print("Using Enumeration to print the elements in vector weekNum: ");
		while(week.hasMoreElements()) {
			System.out.print(week.nextElement()+ " ");
		}
		
	}

}
