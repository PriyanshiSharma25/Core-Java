package Com.Rays.Basics;
public class ReverseNNumber {
	public static void main (String [] args ) {
		int number = 153;
		int sum=0;
		int r;
		int n = number; 
		while ( n>0) {
			r= n% 10;
			sum = sum + (r*r*r);
			n=n/10;
		}
}
}