
public class newpattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int nst=n/2;
		int nsp=1;
 
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			

			
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			 
//	 

			if(row<(n+1)/2) {
				nst--;
				nsp=nsp+2;
			}
			else {
				nst=nst+1;
				nsp=nsp-2;
			}
			row++;
			System.out.println();
		}

		}
	

	




	}


