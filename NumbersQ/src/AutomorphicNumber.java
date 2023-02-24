// number whose square's last digit and number's last digit is same
public class AutomorphicNumber {
	
	static boolean isAutomorphic(int num) {
		int square=num*num;
		while(num>0) {
			if(num%10!=square%10) {
				return false;
			}
				num=num/10;
				square=square/10;
			}
		 
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAutomorphic(76)? "Automorphic":"Not Automorphic");
		System.out.println(isAutomorphic(13)?"Automorphic":"Not Automorphic");

	}

}
