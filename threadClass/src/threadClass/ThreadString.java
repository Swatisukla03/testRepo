package threadClass;

public class ThreadString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread("My thread inserted string .");
		t1.start();
		
		
		
		String str=t1.getName();
		System.out.println(str);

	}

}
