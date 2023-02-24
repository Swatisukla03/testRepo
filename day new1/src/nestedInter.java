interface outerInterface{


    void display();
    interface InnerInterface{

        void msg();

    }
}
class test implements outerInterface.InnerInterface{
   public  void msg(){
        System.out.println("This is inner class msg");
    }

}

public class nestedInter {


    public static void main(String[] args) {
        test t1=new test();
        t1.msg();
    }
    
}

