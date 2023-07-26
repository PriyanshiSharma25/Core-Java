package exercise_Four;

public class ExerciseEight {
	
	//Write a program to create and display 2 dimensional array
	//that contains table from 2 to 10 ( 9 rows, 10 columns)
	public static void main ( String [] args ) {
		
	int[][] Table = new int [10] [10];
	for (int i=1; i<=9; i++ ) {
		for (int j= 1 ; j<=10; j++) {
			System.out.print(i*j + "\t");
		}
	System.out.println(" ");
	}
	}

}
