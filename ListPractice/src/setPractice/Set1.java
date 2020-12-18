package setPractice;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		Set<String> hs = new HashSet();
		hs.add("hello");
		hs.add("hey");//unique key
		hs.add(null);
		hs.add("java");
		hs.add("spring");
		hs.add("christmas");
		System.out.println("hs: "+hs);
		//
		Set<String> lhs = new LinkedHashSet<>();
		lhs.add("hi");
		lhs.add("hey");//unique key
		//hs.add(null);
		lhs.add("java");
		lhs.add("summer");
		lhs.add("new year");
		System.out.println("lhs: "+lhs);
		
		Set<String> ths = new TreeSet<>();
		ths.add("hello");
		ths.add("melody");//unique key
		//hs.add(null);
		ths.add("c");
		ths.add("winter");
		ths.add("2021");
		System.out.println("ths: "+ths);
		
		Set<String> ts = new TreeSet<>(Collections.reverseOrder());
		ts.add("hello");
		ts.add("hey");//unique key
		//hs.add(null);
		ts.add("java");
		ts.add("spring");
		ts.add("christmas");
		System.out.println("ts: "+ts);
		
		System.out.println("ts: "+ts.size());
		System.out.println("ts: "+ts.contains("hey"));
		System.out.println("ts: "+ts.contains("hi"));
				
		ts.remove("jme");
		System.out.println(ts);
		//traverse
		for(String s: ts) {
			System.out.print(s+" ");
		}
		//try addAll, removeAll, retainAll
		ts.addAll(lhs);
		System.out.println("\nafter addAll()");
		for(String s: ts) {
			System.out.print(s+" ");
		}
		System.out.println("\nafter removeAll()");
		ts.removeAll(ths);
		for(String s: ts) {
			System.out.print(s+" ");
		}
		System.out.println("\nafter retainAll()");
		ts.retainAll(lhs);
		for(String s: ts) {
			System.out.print(s+" ");
		}
	}

}
