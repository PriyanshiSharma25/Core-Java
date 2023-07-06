package Com.Rays.Inheritence;

public class TestShape {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(5);
	    r.area();
	    
	    Circle c = new Circle();
	    c.setRadius(3);
	    c.area();
	    
	    Triangle t = new Triangle();
	    t.setBase(10);
	    t.setheight(20);
	    t.area();
	}
	

}
