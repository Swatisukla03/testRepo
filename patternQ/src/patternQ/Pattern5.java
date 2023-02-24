package patternQ;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=sc.nextInt();
		System.out.println("Here is the pattern ...!!");
		for(int i=rows;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
