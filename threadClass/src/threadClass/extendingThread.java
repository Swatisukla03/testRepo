package threadClass;

public class extendingThread extends Thread {
	
	
	public void run() {
		System.out.println("this is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		extendingThread e1=new extendingThread();
		e1.start();
	}
 }


