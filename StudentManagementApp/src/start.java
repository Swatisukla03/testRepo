
public class start {
	
	public static void getnegative(int arr[]) {
		int j=0;
		int temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,-2,-9,-7,21,34};
		getnegative(arr);
		printArray(arr);
		// TODO Auto-generated method stub
		System.out.println("Welcome to student App");

	}

}
