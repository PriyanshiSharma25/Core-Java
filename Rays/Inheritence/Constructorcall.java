package Com.Rays.Inheritence;

public class Constructorcall extends Shape {
	public Constructorcall() {
			System.out.println("default constructor");
		}
	
	public Constructorcall(int a) {
		this();// this for same class
		System.out.println("I am one");
		
	}
	public Constructorcall(int a, int b) {
		this(a);
		System.out.println("I am two");
		}	
	public Constructorcall(int a, int b, int c) {
		
	}
}
