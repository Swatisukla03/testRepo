import java.util.*;
public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows=sc.nextInt();
		System.out.println("Print the pattern : ");
		//1st half of the column
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			//mirroring
			//second half of the column
			
			for(int k=i-1;k>=1;k--) {
				System.out.print(k+" ");
				
			}
			System.out.println();
		}

	}

}
