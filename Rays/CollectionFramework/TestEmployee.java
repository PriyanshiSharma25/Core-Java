package Com.Rays.CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
        List list = new ArrayList();
        
        list.add(new Employee (2, "sachin jat" ,2000000000));
        list.add(new Employee (1, "amuu dubey" ,100000000));
        list.add(new Employee (3, "priyanshi sharma" ,3));
        list.add(new Employee (4, "Rajjo jat" , 0));
        
        
       Collections.sort(list, OrderByName());
       
        Iterator it = list.iterator();
        while(it.hasNext()) {
        	Object object = it.next();
        	System.out.println(object);
        }
   }

	private static Comparator OrderByName() {
		// TODO Auto-generated method stub
		return null;
	}
}
