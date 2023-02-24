import java.util.*;
public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int rows=sc.nextInt();
		int k=1;
		System.out.println("Printing the pattern...");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			
		 
			}
			System.out.println();
		}

	}

}
