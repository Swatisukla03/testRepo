import java.util.Scanner;
public class powerNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base;
		int pow;
		int result=1;
		System.out.print("Enter the base :");
		base=sc.nextInt();
		System.out.print("Enter the power:");
		pow=sc.nextInt();
		for(int i=1;i<=pow;i++) {
			result*=base;
		}
		System.out.println("Result :"+result);

	}
	

}
