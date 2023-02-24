package day5;

public class RightShifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int n=4;
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++) {
			int j,last;
			last=arr[arr.length-1];
			
		}
		 for( int j=arr.length-1;j>0;j--) {
			 arr[j]=arr[j-1];
			
		}
		 arr[0]=last;

	}
      System.out.println()

}
