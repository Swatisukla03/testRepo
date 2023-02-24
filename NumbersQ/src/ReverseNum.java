import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0;
//		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=0) {
			int remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		System.out.println("The Reverse of the given number :"+reverse);

	}

}
