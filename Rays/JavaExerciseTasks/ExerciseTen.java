package Com.Rays.JavaExerciseTasks;

public class ExerciseTen {
	public static void main ( String [] args ) {
// write a program to find weather the givrn number is 
		//amstrong number or not .		
	int number = 340;
	int sum = 0;
	 int r;
	 int n = number ;
	 
	 while ( n>0) {
		 r = number % 10 ;
		 sum = sum * 10 + ( r*r*r);
		 number = n/10;
	 }
	if ( number == sum ) { System.out.println(number + "is an Amstrong number");
	}else { System.out.println(number + "is not an Amstrong number");
	}
}}
