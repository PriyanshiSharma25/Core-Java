package Com.Rays.ExceptionHandling;

public class Person {
 
	private int id= 0;
	private String name= null;
	private String Adress= null;
	public Person(int id, String name, String Adress) {
		this.id= id;
		this.name= name;
		this.Adress= Adress;
		}
	public int getId() {
		return id;
		}
	public String getName() {
		return name;
	}
	public String getAdress() {
		return Adress;
	}
	@Override
	public String toString() {
		
		return id + " "+ name+" " + Adress;
	}
	
	}

