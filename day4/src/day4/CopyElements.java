package day4;
//import
public class CopyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {11,21,31,41,51};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("Elements of the Original Array:");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Elements of new array :");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]+" ");
		}
		

	}

}
