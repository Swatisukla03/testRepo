import java.util.ArrayList;

public class forEachArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>fr=new ArrayList<String>();
		fr.add("Mayank");
		fr.add("Sanjoli");
		fr.add("Spriha");
		fr.add( "Ravi");
		
		
		for(String friend:fr) {
			System.out.println(friend);
			
		}

	}

}
