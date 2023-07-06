package Com.Rays.Basics;

public class PrimeNumber {
	
	public static void main (String [] args) {
	
	int number = 100;
	int count = 0;
	 for ( int i = 1; i<number; i++) {
		 if (number % i == 0) {
			 
			 count++;
			 
			 System.out.println ("number=" + i);
		 }
	 
	 }
		 
	 }
}
