package collectionFrameWork;

public class LinkedList {

	public static void main(String[] args) {
	
				// TODO Auto-generated method stub
				LinkedList al=new LinkedList();
				al.add("Swati");
				al.add("Krishan");
				al.add( "Aryan");
				al.add(1,"Daksh");
				al.remove(2);
//				  ArrayList s1=(ArrayList) al.clone();
//				  System.out.println(s1);
				
				System.out.println(al);

				
				
//				for(int i=0;i<al.size();i++) {
//					System.out.println(al[i]);
//				}
				
				
				for(String i:al) {
					System.out.println(i);
				}
			}

	private void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	private void add(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}

		}

	}

}
