import java.util.*;
public class pattern33 {

	public static void main(String[] args) {
		System.out.println("PracticePattern32");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int rows = 1;
		int nst = n;
		int nst1=0;
		while (rows <= n) {
		int var = n;
		//for numbers
		for (int cst = 1; cst <= nst; cst++) {
		if (cst == nst) {
		System.out.print("* ");
		} else {
		System.out.print(var + " ");
		var=var-1;
		}
		}
		// print number after star
		var = nst1;
		for(int cst=1; cst<=nst1; cst++) {
		System.out.print(var+" ");
		var=var-1;
		}
		// preparation
		System.out.println();
		nst=nst-1;
		nst1++;
		rows++;
		}
		}
		}
		 