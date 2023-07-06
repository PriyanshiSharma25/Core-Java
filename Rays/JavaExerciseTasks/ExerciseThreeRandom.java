package Com.Rays.JavaExerciseTasks;

public class ExerciseThreeRandom {
	public static void main(String[] args) {
		
		// Write a program to generate 5 random integer numbers 
		// between 1 to 100
		
		for ( int i = 0; i <5; i++) {
	
		System.out.println((int)(Math.random() * 100 ));
	}
	}
}
