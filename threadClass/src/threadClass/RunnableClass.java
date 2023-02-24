package threadClass;

public class RunnableClass implements Runnable{
	
	public void run() {
		System.out.println("Thread is running");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableClass r1=new RunnableClass();
		Thread t1=new Thread(r1);
		t1.start();

	}

}
