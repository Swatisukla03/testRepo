package day3;

import java.util.Scanner;



public class SeniorCitizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Age:");
		
		Scanner sc=new Scanner(System.in);
		int Age=sc.nextInt();
		if(Age<18) {
			System.out.println("Child");
		}
//		else if(Age<=45) {
//			System.out.println("Old"); 
//		}
		else if(Age<=60) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior Citizen");
		}
		sc.close();

	}
//	sc.close();
	//initialization
	//condition
	//increamentation

}
