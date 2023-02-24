
public class singleExecution extends Thread {
	
	
	public void run() {
		for(int i=1;i<1000;i++) {
			System.out.println("I am the Confident Girl to Admire.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		singleExecution e1=new singleExecution();
		e1.start();
	}

}
