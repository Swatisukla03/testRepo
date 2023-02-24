package threadClass;

public class ThreadSleep extends Thread {
	
	
	public void run() {
		for(int i=1;i<5;i++) {
			
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				
				
				System.out.println(e);
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ThreadSleep s1=new ThreadSleep();
		ThreadSleep s2=new ThreadSleep();
		
		
		
		
		
		s1.start();
		s2.start();

	}

}
