class Animal {
  protected String name;

  protected void display() {
    System.out.println("I am an animal.");
  }
}

class Dog extends Animal {

  public void getInfo() {
    System.out.println("My name is " + name);
  }
}




public class singleinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Dog laborder=new Dog();
		laborder.name="sweet";
		laborder.display();
		laborder.getInfo();
	}

}
