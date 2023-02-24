package day5;

public class PrintEvenIndexElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,9};
		System.out.println("Element of given array present on even position");
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}

	}

}
