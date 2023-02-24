class employee{
	float sal=1000000;
}


class programmer extends employee{
	int bonus=30000;
}






public class Singleinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programmer p=new programmer();
		System.out.println(p.sal);
		System.out.println(p.bonus);
	}

}
