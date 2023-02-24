package day5;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,54,1,42,67,76};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.print(max);

	}

}
