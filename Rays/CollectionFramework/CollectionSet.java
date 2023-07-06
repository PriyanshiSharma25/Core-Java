package Com.Rays.CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
	public static void main(String[] args) {
		
		Set S = new HashSet();
		
		S.add(100);
		S.add(null);
		S.add("Hi");
		S.add("Hello");
		S.add(9);
		S.add(null);
		S.add(100);
		for( Object object:S) {
		
		System.out.println(object);
	}
	}
}
