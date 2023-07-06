package Com.Rays.ExceptionHandling;

public class TestInvalidUser {

	public static void main(String[] args) {
		
		String name= "Raj jat";
		try {
			if(name.equals("Raja jat")) {
				System.out.println("Valid user...!!");
			}else {
				throw new InvalidUser();
			}}
			catch(Exception e) {
				System.out.println("in catch box = "+ e.getMessage());
			}
		System.out.println("Raj not invalid");
	}

}
