class student{
    int id;
    float salary;
    static String name="Swati";

    static void change(){
        name="Richa";
    }
    student(int i,float s){
        id=i;
        salary=s;
    }



    void display(){
        System.out.println("id :"+id+" "+"name :"+name+" "+"salary :"+salary);
    }

}

public class staticMethod {
 
    public static void main(String[] args) {

        student.change();
        student s1=new student(12,12345f );
        s1.display();

        
    }
    
}
 