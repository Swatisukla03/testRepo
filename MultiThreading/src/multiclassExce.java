
public class multiclassExce  extends Thread{
	
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		   
//			System.out.println(Thread.State);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		multiclassExce e1=new multiclassExce();
		e1.start();
		e1.sleep(MAX_PRIORITY);
        multiclassExce e2=new multiclassExce();
        e2.start();
        
        multiclassExce e3=new multiclassExce();
        e3.start();
		 

	}

}
