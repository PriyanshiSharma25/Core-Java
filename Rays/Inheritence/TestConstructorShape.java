package Com.Rays.Inheritence;

public class TestConstructorShape {
	
	public static void main(String[] args) {
		
		ConstructorRectangle R = new ConstructorRectangle(10,5);
		R.area();
		
		ConstructorCircle C = new ConstructorCircle(9);
		C.area();
		C.Circumference();
		
		ConstructorTriangle T = new ConstructorTriangle(10,5);
		T.area();
	
	}
}
