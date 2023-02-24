import java.util.*;
public class patternnew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		int rows=sc.nextInt();
		System.out.println("**Printing the pattern **");
		
		for(int i=rows;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		for(int i=1;i<=rows;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}


/*
 * 5 4 3 2 1 
 * 4 3 2 1
 * 3 2 1
 * 2 1
 * 1
 * 1 
 * 2 1
 * 3 2 1
 * 4 3 2 1 
 * 5 4 3 2 1
 */
