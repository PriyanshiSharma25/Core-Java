package Com.Rays.Inheritence;

public class ConstructorTriangle extends ConstructorShape {
	public ConstructorTriangle() {
	}

	int Height;
	int Base;

	public ConstructorTriangle(int Height, int Base) {
		this.Height = Height;
		this.Base = Base;
	}

	public void setHeight(int Height) {
		this.Height = Height;
	}

	public void setbase(int Base) {
		this.Base = Base;
	}

	public int getHeight() {
		return Height;
	}

	public int getBase() {
		return Base;
	}

	public void area() {
		int tarea = (getBase() * getHeight()) / 2;
		System.out.println("Area of triangle =" + tarea);
	}
}
