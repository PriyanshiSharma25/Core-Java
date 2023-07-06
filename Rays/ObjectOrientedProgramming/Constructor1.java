package Com.Rays.ObjectOrientedProgramming;

public class Constructor1 {
	public Constructor1() {
	}
		private int id = 0;
		private String name;
		
		public Constructor1(int id, String name){
		this.id= id;
		this.name= name;
		} public void setId(int id) {
			this.id = id;
		} public void setName(String Name) {
			this.name = name;
		} public int getId() {
			return id;
		}public String getName() {
	return name;
		}			
}



