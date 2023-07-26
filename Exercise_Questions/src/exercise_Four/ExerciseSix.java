package exercise_Four;

public class ExerciseSix {
	public static void main(String[] args) {
//Write a program to find Fibonacci series of given number.
		
		int n1= 0;
		int n2= 1;
		int n3,i;
		int n=10;
		
		System.out.print(n1+ " "+ n2);
		
		for ( i=2; i<n; i++) {
			n3= n1+n2;
			System.out.print(" "+ n3);
			
			n1=n2;
			n2=n3;
		}	
	}

}
