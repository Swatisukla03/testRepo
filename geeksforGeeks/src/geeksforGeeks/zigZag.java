package geeksforGeeks;

import java.util.Arrays;

public class zigZag {
	
	
	
	public static void zigzag(int arr[]) {
		int temp=0;
		int flag=1;
		for(int i=0;i<=arr.length-2;i++) {
			if(flag==1) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
				
			}
			
			
			else {
				if(arr[i]<arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				
				}
			}
			if(flag==1)
				flag=0;
			else
				flag=1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4, 3, 7, 8, 6, 2, 1};
		zigzag(arr);
		System.out.println(Arrays.toString(arr));

	}

}
