class student{
	String name;
	int rollNo;
	static String Collegename="Saitm";
	static void changeCollege() {
		String Collegname="iit";
	}
	
	
	
	student(String n,int r){
		name=n;
		rollNo=r;
		
		
	}
	
	
	void display() {

		System.out.println(name+" "+Collegename+" "+ollNo);
	}
}
public class static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1=new student("Swat",11);
	 s1.display();
 

}
	
}
