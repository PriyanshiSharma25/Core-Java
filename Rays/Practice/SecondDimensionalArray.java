package Com.Rays.Practice;

public class SecondDimensionalArray {
	
	public static void main( String[] args) {
		
	  int[][] table =new int[10][10] ;
	  for (int i =1 ; i<=10;i++) {
		 for (int j= 1; j < 10; j++) {
			 table[i-1][j-1] = i*j;

		System.out.print(table[i-1][j-1]+"\t");
		 }
		 System.out.println();
	  }

		
		 for (int i = 0; i < 10; i++) {

		for (int j=0; j < 10; j++) {

		System.out.print(table[i][j] + "\t"); }

		System.out.println(" ");
		
		}
	
		 
		

		for (int[] is: table) {

		for (int i : is) {

		System.out.print(i + "\t"); 

		System.out.println();
		}
		}
		}
}
