package Exercise_nine;

public class Question1_ARectangle extends Qyestion1_shape{
    private int length ;
    private int width;
    public void setLength(int length) {
    this.length = length;
    }
    public int getLength() {
    return length; 
    }
    public void setWidth(int width) {
    	this.width =width;
    	}
    public int getWidth() {
    	return width;
    	 }
	public void area() {
		 int rarea = length * width;
		 System.out.println("Area of rectangle = "+ rarea );
	}
}
