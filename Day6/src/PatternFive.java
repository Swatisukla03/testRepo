import java.util.Scanner;
public class PatternFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row_size=s.nextInt();
		for(int i=1;i<=row_size;i++) {
			for(int j=1;j<=row_size-i;j++) 
				System.out.print(" ");
				for(int k=1;k<=i;k++)
					System.out.print("*");
			
				        System.out.println();
			}
			s.close();
				
			
		}
		

	}


