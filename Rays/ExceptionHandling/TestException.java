package Com.Rays.ExceptionHandling;

public class TestException {
	public static void main(String [] args) {
	
		try {
			int a = 50;
			System.out.println("a = "+ a);
			int b = 0;
			System.out.println("b = "+ b);
			int c = a/b;
			System.out.println(" Division =" + c);
			}catch(Exception e) {
				//System.out.println("In catch block"+ e.getMessage());
				//System.out.println("in catch block"+ e);
				e.printStackTrace();
				}
		System.out.println("After catch block");
	
		}
}
