package Com.Rays.Basics;

public class TestArray1 {
	
	public static void main( String [] args) {
		
		int[] Table= {2,4,6,8,10,12,14,16,18,20};
		
		int number = 18 ;
		 for ( int i =0 ; i< Table.length; i++) {
			 if ( Table[i]==  number ) {
				 System.out.println("Index =" + i);
				 
			 }
		 }
	}

}
