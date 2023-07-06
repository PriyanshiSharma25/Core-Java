package Com.Rays.Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	
	public static void main(String [] args) throws ParseException {
		
	String str = "01/01/2024";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d = sdf. parse(str);
	
	System.out.println(d);
			
	}

}
