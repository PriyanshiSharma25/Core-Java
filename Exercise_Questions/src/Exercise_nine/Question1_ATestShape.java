package Exercise_nine;

public class Question1_ATestShape {
	public static void main(String[] args) {
		
		Question1_ARectangle rect= new Question1_ARectangle();
		rect.setLength(5);
		rect.setWidth(5);
	    rect.area();
		
	    Question_1ATriangle  t= new Question_1ATriangle ();
	    t.setLength(5);
	    t.setHeight(5);
	    t.area();
	    
	    Question1_ACircle C = new Question1_ACircle();
	    C.setRadius(5);
	    C.area();
	    
		
	}

}
