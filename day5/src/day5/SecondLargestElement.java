package day5;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,size;
		int array[]= {10,32,14,78,92,97};
		size=array.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("second largest number ::"+array[size-2]);
		
		

	}

}
