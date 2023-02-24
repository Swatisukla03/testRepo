package day5;

public class RotateElementNtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,6,8,2};
		int n=3; // shows how many times it will rotate
		System.out.println("Original Array :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int j,first;
		for(j=0;j<n;j++) {
			 
			first=arr[0]; //storing the first element at first
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
			
		}
		System.out.println();
		System.out.println("Array after left rotation :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
