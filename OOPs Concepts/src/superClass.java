

class base{
 

     base(){
         System.out.println("Base class Constructor");
     
    		 
    	 }
	 void display() {
		 System.out.println("display func");
 
    }
}




//class derived extends base{
//
//    void display(){
//        super.earnings();
//    }
//
//}

class derived extends base{

    derived(){
    	
      super.display();
      System.out.println("Derived class constructor");
//      super();
  }

}


public class superClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	        derived d1=new derived();
//	        d1.display();

	    

	}

}
