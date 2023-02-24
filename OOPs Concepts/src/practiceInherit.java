class animal{
	void eat() {
		System.out.println("Eating ....");
		
	}
}
class dog extends animal{
	void bark() {
		System.out.println("barking ...");
		
	}
}


class babyDog extends dog{
	void sweep() {
		System.out.println("Sweeping ...");
		
	}
}




public class practiceInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		babyDog baby=new babyDog();
		baby.eat();
		baby.bark();
		baby.sweep();
		}

}
