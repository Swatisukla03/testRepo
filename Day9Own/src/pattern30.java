import java.util.*;
public class pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int size,i,j;
		 System.out.println("Please enter the size:");
		 size=sc.nextInt();
		 for( i=1;i<=size;i++) {
			 for(j=size;j>=1;j--) {
				 if(i==j) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print(j+" ");
				 }
				 
			 }
			 System.out.println();
			 
		}

	}

}
		
	 