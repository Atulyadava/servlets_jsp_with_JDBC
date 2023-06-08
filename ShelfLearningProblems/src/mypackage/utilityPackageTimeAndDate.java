package mypackage;
import java.util.*;
public class utilityPackageTimeAndDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar objcalendar=Calendar.getInstance();
		System.out.println("\n Date and Time Components");
		System.out.println("year: "+objcalendar.get(Calendar.YEAR));
		System.out.println("month: "+objcalendar.get(Calendar.MONTH));
		System.out.println("Date: "+objcalendar.get(Calendar.DATE));
		System.out.println("hour: "+objcalendar.get(Calendar.HOUR));
		System.out.println("minute: "+objcalendar.get(Calendar.MINUTE));
		System.out.println("second: " +objcalendar.get(Calendar.SECOND));
		Date objdate=objcalendar.getTime();
		System.out.println(objdate);
		objcalendar.add(Calendar.MINUTE,30);
		//System.out.println(objcalendar);
  
	}

}
