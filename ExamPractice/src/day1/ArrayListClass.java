package day1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ArrayList<String>list=new ArrayList<>();
		list.add("Mango");
		list.add("Apple");
		list.add("banana");
		
//		System.out.println(list);

		
		
		
		
		Iterator itr=list.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
