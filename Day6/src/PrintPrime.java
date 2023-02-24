import java.util.Scanner;
public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int count=0;
		boolean flag =true;
		int i=1;
		while(i<=n) {
			if(n%i==0) {
				System.out.println(i);
				count=count++;
				flag=false;
//				i++;
			}
			i++;
			
			 
		}
		System.out.println(count);
		if(count==2) {
			System.out.println("Prime");
//			i++;
		}
//		else {
//			System.out.println("Non-Prime");
//		}
		

	}

}
