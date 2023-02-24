import java.util.*;
public class pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows to print pattern :");
		int rows=sc.nextInt();
		System.out.println("**Printing the Pattern**");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
