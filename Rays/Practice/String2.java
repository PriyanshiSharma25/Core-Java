package Com.Rays.Practice;

public class String2 {

	public static void main( String [] args) {
		
		String S1 = " Doctor Strange";
		String S2 = " And Christine";
		
		StringBuffer sb = new StringBuffer("Computer");
		sb.append ("Science");
		
		System.out.println (sb);
		System.out.print("length :" + sb.length());
		System.out.println();
		System.out.print("Capacity :" + sb.capacity());
	System.out.println("char:" + sb.charAt(5));
	}
}
