package Com.Rays.Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStringBuffer {
	
	public static void main(String [] args) throws ParseException {
		
		StringBuffer sb= new StringBuffer("25/03/2003");
		String str= sb.toString();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = sdf.parse(str);
		System.out.println(d);
		System.out.println(sb);
		System.out.println(str);
		
	}

}
