package listPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List li1 = new LinkedList();
		li1.add("hello");
		li1.add(222);
		li1.add(true);
		li1.add(912123);
		System.out.println("i1= "+li1);

		List<Integer> li2=new LinkedList<>();
		li2.add(122);
		li2.add(22);
		li2.add(122);
		li2.add(null);
		li2.add(34);
		System.out.println("li2= "+li2);
		
		li2.add(0,333);
		System.out.println("li2= "+li2);
		li2.set(0,444);
		System.out.println("li2= "+li2);
		System.out.println("li2.size() = "+li2.size());
		System.out.println("li2.get(3) = "+li2.get(3));
		
		li2.remove(2);//index not value
		System.out.println("li2= "+li2);
		
		Integer i = 22;
		li2.remove(i);
		System.out.println("li2 ater li2.remove(i) = "+li2);
		while(li2.remove(i)) {
			
		}
		System.out.println("li2 after while(li2.remove(i){}= "+li2);
		
		System.out.println("li2= "+li2.contains(122));
		System.out.println("li2= "+li2.contains(900));
		
		//traverse
		for(int j = 0; j < li2.size(); j++) {
			System.out.print(li2.get(j)+" ");
		}
		//shortcut
		for(Integer j:li2) {
			System.out.print(j+" ");
		}
		System.out.println();
		Collections.reverse(li2);
		System.out.println("after reverse: "+li2);
		Collections.shuffle(li2);
		System.out.println("after shuffle: "+li2);
		
		Collections.replaceAll(li2, null, -1);
		System.out.println("after replace null with -1: "+li2);
		Collections.sort(li2);
		System.out.println("after sort: "+li2);
		
		Collections.sort(li2, Collections.reverseOrder());
		System.out.println("after ollections.reverseOrder(): "+li2);
		
		Collections.sort(li2);
		System.out.println("after ollections.sort(li2) binarySearch: "+li2);
		System.out.println("after ollections.sort(li2) binarySearch: "+Collections.binarySearch(li2, 100));
		
		List<Integer> li3=new ArrayList<>(li2);
		System.out.println("li3= "+li3);
		li3.addAll(li2);
		System.out.println("li3= "+li3);
		li3.add(100);
		li3.add(200);
		li3.add(300);
		System.out.println("li3= "+li3);
		System.out.println("li2= "+li2);
		li3.retainAll(li2);
		System.out.println(" fter retainAll "+li3);
		
		li3.removeAll(li2);
		System.out.println("li3 after removeAll "+li3);
		
		
	}

}
//Task:
//1. play around all the methods above
//2. repeat the arrays problems given earlier here using Lists
//3. Explore Queue interface and try to implementing Queue using 
