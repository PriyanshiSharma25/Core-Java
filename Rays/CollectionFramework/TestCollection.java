package Com.Rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		
		Collection list = new ArrayList();
		
		list.add("Iron Man");
		list.add("Captain America");
		list.add("Thor");
		list.add("Hulk");
		list.add("Black Widow");
		list.add("Scarlett Witch");
		list.add("Captain Marvel");
		list.add(2011);
		list.add("Doctor Strange");
		
		
		//System.out.println(list);
		
		Collection Villain = new ArrayList();
		Villain.add("Thanos");
		Villain.add("Ultron");
		
		Collection AntiHero = new ArrayList();
		AntiHero.add("Loki");
	
		list.addAll(Villain);
		list.add(AntiHero);
		System.out.println(Villain);
		System.out.println(AntiHero);
		System.out.println(list);
		
		list.remove("Ultron");
		list.size();
		System.out.println(list);
		System.out.println(list.size());
		
	}
	
	

}
