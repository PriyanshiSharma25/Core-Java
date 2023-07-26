package Exercise_nine;

public class Question1_ACircle extends Qyestion1_shape {

	private int radius = 0;
    final double PI =3.14;
    public void setRadius(int radius) {
    	this.radius= radius;
    	}
    public int getRadius() {
    	return radius;
    }
	public void area() {
		  double carea = PI*(radius*radius);
		System.out.println("Area of rectangle = "+ carea);
	}

}
