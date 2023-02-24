import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String>li=new LinkedList<>();
		li.add("Swati");
		li.add("Aryan");
		li.add("Lakshay");
		
		
		Iterator<String>itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
