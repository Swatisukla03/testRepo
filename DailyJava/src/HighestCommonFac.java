import java.util.Scanner;
public class HighestCommonFac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dividend,divisor;
		int remainder,hcf=0;
		System.out.println("Enter the dividend :");
		dividend=sc.nextInt();
		System.out.println("Enter the divisor");
		divisor=sc.nextInt();
		do {
			remainder=dividend%divisor;
			if(remainder==0) {
				hcf=divisor;
			}
			else {
				dividend=divisor;
				divisor=remainder;
		
			} 
		}while(remainder!=0);
		
		System.out.println("HCF :"+hcf);
		

	}

}
