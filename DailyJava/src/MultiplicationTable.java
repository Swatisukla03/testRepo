import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int num;
		System.out.print("Enter any positive integer: ");
//		num=console.nextInt();
		int num=sc.nextInt();
		System.out.println("Multiplication Table of "+num);
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}

		

	}

}
