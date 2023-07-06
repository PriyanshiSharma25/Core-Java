package Com.Rays.Inheritence;

public class Shape {
	private String Colour;
	private int BorderWidth = 0;
	
	public void setColour (String Colour) {
		this.Colour= Colour;}
	public String getColour(){
		return Colour;
		}
	
	public void setBorderWidth(int BorderWidth) {
		this.BorderWidth= BorderWidth;
		}
	public int getBorderWidth() {
	return BorderWidth;
		}
	public void area() {
		String s= getColour();
		int i= getBorderWidth();
		System.out.println("Shape area colour" + s);
		System.out.println("Shape area borderwidth" + i);
	}
	
	}
	
