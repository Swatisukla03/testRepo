package day5;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,13,42,1,6,7,8,9,10};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);

	}

}
