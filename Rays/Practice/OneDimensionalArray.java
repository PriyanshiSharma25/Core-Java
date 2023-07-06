package Com.Rays.Practice;

public class OneDimensionalArray {
	public static void main( String[] args) {
		
	int [] Table1 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20} ;
		
	int [] Table2 = new int [10];
	
	for( int i = 1; i <= Table2.length; i++) {
		 Table2 [i-1]= 2*i ;
		 
	}

		 for (int i : Table2 ) {
		 System.out.print (i + " ");

		 }
	}
	}
