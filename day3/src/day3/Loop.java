package day3;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the num:");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=num) {
		//System.out.println(i);
//			i=i+1;
			sum=sum+i;
			i=i+1;
			 
		 
			
		}
		System.out.print(sum);
		sc.close();

	}

}
