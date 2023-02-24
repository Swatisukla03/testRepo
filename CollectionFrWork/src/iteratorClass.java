import java.util.ArrayList;
import java.util.Iterator;

public class iteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list=new ArrayList<>();
		list.add("Mango");
		list.add("Apple");
		list.add("Graphes");
		list.add("Blueberries");
		
		
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
