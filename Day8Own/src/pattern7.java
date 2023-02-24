import java.util.*;
public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	 
		System.out.println("Enter the no of rows:");
		int rows=sc.nextInt();
		System.out.println("**Printing the pattern **");
		for(int i=1;i<=rows;i++) {
			int temp=i;
			for(int j=i;j>=1;j--) {
				 
				System.out.print(temp+" ");
				temp=temp+rows;
			}
			System.out.println();
		}
		

	}

}
