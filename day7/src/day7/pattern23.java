package day7;

public class pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'int 
		int n=5;
		int row=1;
		int nst=1;
		int nsp=n-1;
		int val=1;
		
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			int cval=val;
			while(cst<=nst) {
				System.out.print(cval+"");
				cval++;
				cst++;
			}
			nsp--;
			nst+=2;
			row++;
			val=cval;
			System.out.println();
		}
		 

	}

}
