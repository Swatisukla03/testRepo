package day5;

//public class DuplicateElement {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,4,1,4,2,2,5,3};
//		System.out.println("Duplicate elements in the given array :");
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j])
//					System.out.println(arr[j]);
//			}
//		}
//
//	}
//
//}
public class DuplicateElement {  
public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1,2,3,4,1,4,2,5,3};  
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  
