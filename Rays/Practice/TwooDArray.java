package Com.Rays.Practice;

public class TwooDArray {
	public static void main(String [] args) {
		
		int [] [] Table = new int [10][10];
		 
		for (int b = 1; b<= 10; b++) {
			for (int c = 1; c <=10; c++) {
				
				Table [b-1][c-1]= b* c;
			}
		}
		for ( int [] w: Table) {
			for (int i =1; i<w.length; i++) {
				System.out.print(w [i] + "\t");
			}
			System.out.println();
				
			}
		}
	}


