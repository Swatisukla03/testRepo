import java.util.*;
public class decTobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the no  to convert:");
		int n=sc.nextInt();
		int ans=0;
         int multi=1;
         Scanner sc1=new Scanner(System.in);
         System.out.println("Enter the base of conversion :");
         
          int base=sc1.nextInt();
//         int n;
         //n>0 that means when it is 0 it will terminate
         while(n!=0) {
        	  int remainder=n%base; //57 -->28 -->1
        	  ans=ans+multi*remainder; // 0+1*1
        	  multi=multi*10; //1*10
        	  n=n/base;
         }
         System.out.println(ans);
		

	}

}
