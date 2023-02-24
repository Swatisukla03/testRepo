package threadClass;

public class threadRunnableString  implements Runnable{
	
	
	
	public void run() {
		System.out.println("now running the thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1=new threadRunnableString();
		Thread th1=new Thread(r1,"My New Thread .");
		
		
		th1.start();
		
		
		
		String str=th1.getName();
		System.out.println(str);

	}

}
