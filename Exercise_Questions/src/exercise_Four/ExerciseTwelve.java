package exercise_Four;

public class ExerciseTwelve {
public static void main (String [] args) {
	
// Write a program to find weather a number is a palindrome or not!
	
	int number = 121;
	int reverse =0;
	int r;
	int n = number; 
	while ( n>0) {
		r= n% 10; //
		reverse = reverse *10 + r;
		n=n/10;
	}
	System.out.println(reverse);
	
	}
}

