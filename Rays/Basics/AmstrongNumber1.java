package Com.Rays.Basics;

public class AmstrongNumber1 {

	public static void main (String [] args ) {
		int number = 153;
		int sum=0;
		int r;
		int n = number; 
		while ( n>0) {
			r= n% 10;
			sum = sum + (r*r*r);
			n=n/10;
 }if ( number == sum) {
	 System.out.println("Amstrong Number" + number);
 } else { 
	 System.out.println(" Not Amstrong Number");
	 
 }
	}
}
