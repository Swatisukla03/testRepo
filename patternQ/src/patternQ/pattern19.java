package patternQ;

import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of rows:");
		Scanner sc1=new Scanner(System.in);
		int row=sc1.nextInt();
//		System.out.println("Enter the no of columns:");
//		Scanner sc2=new Scanner(System.in);
//		int col=sc2.nextInt();
		int number=1;
		for(int i=1;i<=row;i++) {
			//inner loop
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
				
			System.out.print("1"+" ");
				}else {
					System.out.print("0"+" ");
					
				}
//			number++;
				} 
			System.out.println();
			 
			
			}
			 
		}
//	System.out.println();

	

	












	




	}


