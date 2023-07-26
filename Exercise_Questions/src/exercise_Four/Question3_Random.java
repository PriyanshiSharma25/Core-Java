package exercise_Four;

public class Question3_Random {
// Write a program to generate 5 random numbers between 1 and 100 and number should not follow with decimal point
	
	public static void main(String[] args) {
		System.out.println("5 random numbers between 1 and 100 are = " );
		for( int i = 1; i<=5; i++) {
		int j= (int) ((double)Math.random() * 100);
		
		System.out.println(j);

}}
		
}
