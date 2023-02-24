import java.util.*;
public class pattern33own {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n:");
		int n=sc.nextInt();
		System.out.println("Pattern is :");
		int nsp=n-1;
		int row=1;
		int nst=1;
		int zero=0;
		int val;
		while(row<=n) {
			val=n+1-row;
			int csp=1;
			while(csp<=nsp) {
				System.out.println(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				if(nsp+nst==n ||csp+cst==n+1) {
					System.out.println(zero+" ");
				}
				else {
					System.out.println(val+" ");
				}
				
			     if(cst<=nst/2) {
			    	 val++;
				}
			     else {
			    	 val--;
			     }
			     cst++;
			     
			}
			nst=nst+2;
			nsp=nsp-1;
			System.out.println();
			row=row++;
			 
		}
		 

	}

}
