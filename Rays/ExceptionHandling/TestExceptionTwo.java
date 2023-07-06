package Com.Rays.ExceptionHandling;

public abstract class TestExceptionTwo {
public static void main (String []args) {
	try {
		//String n= "100";
		String name= "Pihu";
		//int n1= Integer.parseInt(n);
		System.out.println(name.charAt(8));
	}catch(ArithmeticException e) {
		System.out.println("Arithmetic exception="+ e.getMessage());
		}catch (NumberFormatException e) {
			System.out.println(" number format exception ="+ e);
		}catch(Exception e) {
			System.out.println("Exception is ="+ e);
		}finally {
			System.out.println("Exception Mechanism or Syntax..!!");
		}
}
	}
