package Com.Rays.Practice;

public class Diamond {
	public static void main ( String [] args) {
		
		int number = 1;
		for( int i = 10; i >= number ; i--) 
		{
			for(int j = number; j<= i; j++)
			{
				System.out.print("  ");
			}
			for(int k = 10; k >= i; k--)
			{
				System.out.print("*");
				System.out.print("   ");
			}

			System.out.println();
		}
	}

}
