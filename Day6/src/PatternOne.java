import java.util.Scanner;
 /*/*****
*   *
*   *
*   *
*   *
******/
public class PatternOne {
//	public static void main(String[] args) {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 int n=5; // no of rows in this pattern
			 int col=5; //no of columns
			 int row=1;
			 while(row<=n) {
				 int i=1;
				 while(i<=col) {
					 if(row==1 ||row==n ||i==1||i==col)
						 System.out.print(" *");
					 else {
						 System.out.print("  ");
					 }
					 i++;
				 }
				 row++;
				 System.out.println();
				 }
			 }
}
	
 