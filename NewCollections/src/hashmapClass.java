import java.util.HashMap;

public class hashmapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String>num=new HashMap<>();
		System.out.println("Initial HashMap:" +num);
		
		
		num.put(1,"Swati");
		num.put(2,"Two");
		num.put(3,"Three");
		System.out.println("HashMap after put(): "+num);
		
		System.out.println("accessing the elemnts :");
		String value=num.get(1);
		System.out.println("Value at 1 :"+value);
		num.replace(2,"Aryan");
		num.replace(3,"Shubjham" );
		System.out.println("replace the hashMap:"+num);
		

	}

}
