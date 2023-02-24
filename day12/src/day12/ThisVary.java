package day12;

class demo1{
    void method1(){
    	System.out.println("Namaste Indians");

    }



    void method2(){
        System.out.println("This is method 2 .");

        this.method1();
    }
}



public class ThisVary {

    public static void main(String[] args) {
        demo1 d1=new demo1();
        // d1.method1();
        d1.method2();
        
    }
    
}