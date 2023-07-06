package Com.Rays.CollectionFramework;
import java.util.HashMap;
public class Map {
	public static void main(String[] args) {
		System.out.println("Icc WorldCup 2003\nPakistan vs India");
		HashMap m = new HashMap();
		m.put("Sachin Tendulkar", 98);
		m.put("Virendra Sehwag",21 );
		m.put("Sourav Ganguly", 0);
		m.put("Mohammad Kaif", 35);
		m.put("Rahul Dravid", 44);
		m.put("Yuvraj Singh", 50);
		m.put("Extras", 28);
		m.put("Total", 276);
		
		System.out.println(m.entrySet());
		System.out.println(m.size());
		
		System.out.println("India won by 6 wickets");
	}

}
