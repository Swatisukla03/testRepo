
public class countDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
//		int multi=
		int ans=0;
		while(n!=0) {
			int rem=n%10;
			ans=ans*10+rem;
//			multi=multi/10;
			n=n/10;
			
		}
//		System.out.println(count);
		System.out.println(ans);

	}

}
