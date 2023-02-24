class bike{
	void run() {
		System.out.println("running");
		
	}
}

class splender extends bike{
	void run() {
		System.out.println("running safely with 60km");
	}
	
}
 
public class polymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b=new splender();
		b.run();

	}

}
