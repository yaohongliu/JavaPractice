package listIterator;
//ListIterator - read, remove, add from any direction but it is only it is only used with list interface
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTask {

	public static void main(String[] args) {
		ListIterator<String> li = null;
		List<String> weekDay = new ArrayList<String>();
		weekDay.add("Monday");
		weekDay.add("Tuesday");
		weekDay.add("Wednesday");
		weekDay.add("Thursday");
		weekDay.add("Friday");
		//obtain list iterator
		li = weekDay.listIterator();
		System.out.println("Traverse the list forward:");
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println("\nTraverse the list backward:");
				while(li.hasPrevious()) {
					System.out.print(li.previous()+" ");
				}
		li.remove();//current at Monday so remove Monday
		System.out.println("\nPrint the list after remove :"+weekDay);
		li.next();//at Tuesday 
		li.next();//at Wednesday
		li.remove();//remove the current position element, so remove Wendesday
		System.out.println("\nPrint the list after remove :"+weekDay);
		
		li.add("Monday");//add Monday at current position
		System.out.println("\nPrint the list after add \'Monday' :"+weekDay);
		
	}

}
