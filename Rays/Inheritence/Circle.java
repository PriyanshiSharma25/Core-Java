package Com.Rays.Inheritence;

public class Circle extends Shape {
	private int Radius= 0;
	private static final double PI = 3.14;
	
	public void setRadius(int Radius) {
		this.Radius= Radius;
	}
	public int getRadius() {
		return Radius;
	}
	public void area() {
		double carea =  PI * getRadius() * getRadius();
		System.out.println("area of circle =" + carea);
		
	}

}
