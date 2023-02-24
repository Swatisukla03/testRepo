
public class runnableInterface implements Runnable  {
	public void run() {
		System.out.println("This is thread implemented.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runnableInterface r1=new runnableInterface();
		Thread t1=new Thread(r1);
		t1.start();

	}

}
