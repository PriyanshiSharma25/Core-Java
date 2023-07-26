package Exercise_nine;

public class Question_1ATriangle {
	private int length = 0;
	private int height = 0;
	public void setLength(int length) {
		this.length= length;
	}
	public int getLength() {
	return length;
}
	public void setHeight(int height) {
		this.height= height;
	}
	public int getHeight() {
		return height;
	}
	public void area() {
	   double tarea = (length * height)*0.5;
		System.out.println("Area of triangle = "+ tarea);
	}
}
