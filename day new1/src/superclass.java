
class Animal{
    void eat(){
        System.out.println("eating ");
    }

}

class dog extends Animal{

    void eat(){
        System.out.println("eating bread");


    }

    void bark(){
        System.out.println("Barking on streets.");
    }


    void display(){
        super.eat();
        bark();
        eat();
    }

}

public class superclass {

    public static void main(String[] args) {
        dog d1=new dog();
        d1.display();
        
    }
    
}

