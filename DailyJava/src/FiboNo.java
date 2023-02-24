
public class FiboNo {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n1=0,n2=1,n3,i,count=5;
//		System.out.print(n1+" "+n2);
//		for(i=0;i<count;i++) {
//			n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}
//
//	}


//fibonacci with Recursion
		static int n1=0,n2=1,n3=0;
		static void printFibo(int count) {
			if(count>0) {
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.print(" "+n3);
				printFibo(count-1);
			}
			
		}
		
		public static void main(String[] args) {
			int count=5;
			System.out.print(n1+" "+n2);
			printFibo(count-2);

	}
}