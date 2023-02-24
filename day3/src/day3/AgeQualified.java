package day3;
import java.util.Scanner;

public class AgeQualified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Age :");
		Scanner sc=new Scanner(System.in);
		int Age=sc.nextInt();
		if(Age>=18) {
			System.out.println("Qualified  Boards");
		}
		else {
			System.out.println("Not Eligible");
		}

	}

}
