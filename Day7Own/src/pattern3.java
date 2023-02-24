import java.util.*;
public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		int rows=sc.nextInt();
		System.out.println("---Printing the pattern---");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}

	}

}
