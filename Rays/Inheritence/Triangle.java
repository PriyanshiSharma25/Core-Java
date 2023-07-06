package Com.Rays.Inheritence;

public class Triangle extends Shape{

private int height;
private int Base;

public void setheight(int height) {
	this.height= height;
	}
 public int getheight(){
	 return height;
 }
public void setBase( int Base) {
	this.Base = Base;
}
public int getBase() {
	return Base;
}
 public void area() {
	 int tarea= (getBase() * getheight())/2;
	 System.out.println("area of triangle =" + tarea);
 }
 
}
