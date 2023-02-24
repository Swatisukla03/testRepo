import java.util.Scanner;

public class decimalTobBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the no  to convert:");
		int n=sc.nextInt();
		int ans=0;
         int multi=1;
//         Scanner sc1=new Scanner(System.in);
//         System.out.println("Enter the base of conversion :");
         
          int base=10;
//           int count=1;
//         int n;
         //n>0 that means when it is 0 it will terminate
         while(n!=0) {
        	  int remainder=n%10; //57 -->28 -->1
        	  ans=ans+multi*remainder; // 0+1*1
        	  multi=multi*base; //1*10
        	  
        	  n=n/10;//updation
//        	  count++;
         }
         System.out.println(ans);
//         System.out.println(count);
		

	}




	}


