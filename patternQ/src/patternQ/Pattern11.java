package patternQ;
//import java.util.*;
import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of rows:");
		Scanner sc1=new Scanner(System.in);
		int row=sc1.nextInt();
		System.out.println("Enter the no of columns:");
		Scanner sc2=new Scanner(System.in);
		int col=sc2.nextInt();
		for(int i=1;i<=row;i++) {
			//inner loop
			for(int j=1;j<=col;j++) {
			System.out.print("*");
			}
			System.out.println();
		}

	}

}
