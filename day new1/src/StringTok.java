import java.util.StringTokenizer;

public class StringTok {

	public static void main(String[] args) {
		String str="How ! are u going";
		StringTokenizer st=new StringTokenizer(str ,"!",false);
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
		      System.out.println(st.countTokens());
		}
		// TODO Auto-generated method stub

	}
	



