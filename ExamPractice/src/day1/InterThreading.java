package day1;


class Customer{
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("Withdraw is going on");
		if(this.amount<amount) {
			System.out.println("low balance need recharge.");
			
			try{
				wait();
				
			}catch(Exception e) {}
		}
		this.amount-=amount;
		System.out.println("withdraw the respective amount");
		
//		this.amount+=amount;
//		System.out.println("amount is deposited successfully");
	}
	
	
	
	
	
	synchronized void deposit(int amount) {
		System.out.println("deposition started");
		this.amount+=amount;
		System.out.println("deposited successfully");
	}
}

public class InterThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		final Customer c1=new Customer();
		new Thread() {
			public void run() {
				c1.withdraw(13000);
				
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				c1.deposit(200000);
				
			}
		}.start();

	}

}
