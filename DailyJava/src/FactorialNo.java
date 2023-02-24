import java.util.Scanner;
public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
		int fact=1;
		System.out.print("Enter any positive integer :");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact *=i;
		}
		System.out.println("Factorial is :"+fact);
		

	}

}
