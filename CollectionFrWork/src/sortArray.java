import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l1=new ArrayList<>();
		l1.add(21);
		l1.add(18);
		l1.add(10);
		l1.add(14);
		
		Collections.sort(l1);
		
		
		for(Integer num:l1) {
			System.out.println(num);
		}

	}

}
