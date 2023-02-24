class animal{
	void eat() {
		System.out.println("Eating");
	}
	
}


class dog extends animal{
	void bark() {
		System.out.println("Barking");
	}
	
}

class cat extends animal{
	void meow() {
		System.out.println("meowing");
	}
	
}
public class heirarchy {
	
	
	public static void main(String args[]) {
		cat c1=new cat();
		dog d1=new dog();
		c1.eat();
		c1.meow();
		
		d1.bark();
	}

}
