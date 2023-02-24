import java.util.*;
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the no of rows :");
		int row=sc.nextInt();
		System.out.println("--Printing the pattern---");
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
			
		
		

	}

}
