package Com.Rays.Basics;

public class TestArray {
	
	public static void main(String [] args) {
		
		int [] table = { 2,4,6,8,10,12,14,16,18,20 };
		String [] names = { "abc", "xyz"};
		
		for ( int i= 0; i< table.length; i++) {
			System.out.print(table[i]);
		}	
			for ( int a : table) {
				System.out.println(a);
	
		}
			for (String S:names) {
				System.out.println(S);
				}
			}
	}


