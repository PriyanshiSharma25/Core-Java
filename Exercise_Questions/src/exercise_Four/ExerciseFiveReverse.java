 package exercise_Four;

public class ExerciseFiveReverse {
	
	public static void main( String [] args) {
		
		int number = 121;
		int reverse =0;
		int r;
		int n = number; 
		while ( n>0) {
			r= n% 10; //
			reverse = reverse *10 + r;
			n=n/10;
		}
		System.out.println( "Reverse of number is " + reverse);	
		
	}
}
