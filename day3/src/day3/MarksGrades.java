package day3;
import java.util.Scanner;

public class MarksGrades {

	public static void main(String[] args) {
		System.out.println("Enter the Marks:");
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Marks=sc.nextInt();
		//NESTED LOOPING
		if(Marks>=85) {
			System.out.println("A");
		}
		else  {
			if(Marks>=65) {
				System.out.println("B");
			}
			else {
				System.out.println("C");
			}
		}


	}

}
