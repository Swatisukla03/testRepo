import java.util.*;
public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		int rows=sc.nextInt();
		System.out.println("--Patterns--");
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			 System.out.println();
		}
		

	}

}
