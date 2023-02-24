class shape{
	
	void area() {
		System.out.println("Area is :");
	}
	
	
}


class rectangle extends shape{
	int length=3;
	int breadth=7;
	
	
	void area() {
		System.out.println("Length *Breadth  :"+length*breadth);
	}
	
}


class square extends shape{
	int side=12;
	
	void area() {
		System.out.println("side*side :"+side*side);
	}
	
	
}

class circle extends shape{
	float radius=5.6f;
	void area() {
		System.out.println("pi*radius*radius :"+3.14*radius*radius);
	}
	
}



public class runTime {
	public static void main(String args[]) {
		
		shape s1;
		s1=new rectangle();
		s1.area();
		
		s1=new circle();
		s1.area();
		s1=new square();
		s1.area();
	}

}
