package Com.Rays.ExceptionHandling;

public class TestPropogatioin {

	public static void main(String[] args) {
		Dad();
	}	
		public static void Dad(){
			try {
				Mom();
			} catch (PropogationGalti e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		public static void Mom() throws PropogationGalti {
			Son();	
}
		public static void Son() throws PropogationGalti {
			throw new PropogationGalti();
		}
}
