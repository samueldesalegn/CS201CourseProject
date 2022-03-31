package src.lesson3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalender {

	public static void main(String[] args) {
		 GregorianCalendar cal = new GregorianCalendar();

	        System.out.println(cal.getTime());
	        System.out.println("");

	        System.out.println("YEAR:          " + cal.get(Calendar.YEAR));
	        System.out.println("MONTH:         " + cal.get(Calendar.MONTH)+1);// Calendar month starts 0, so 1 added to show the right month
	        System.out.println("DATE:          " + cal.get(Calendar.DATE));

	        System.out.println("DAY_OF_YEAR:   " + cal.get(Calendar.DAY_OF_YEAR));
	        System.out.println("DAY_OF_MONTH:  " + cal.get(Calendar.DAY_OF_MONTH));
	        System.out.println("DAY_OF_WEEK:   " + cal.get(Calendar.DAY_OF_WEEK));

	        System.out.println("WEEK_OF_YEAR:  " + cal.get(Calendar.WEEK_OF_YEAR));
	        System.out.println("WEEK_OF_MONTH: " + cal.get(Calendar.WEEK_OF_MONTH));

	        
	        System.out.println("HOUR:          " + cal.get(Calendar.HOUR));
	        System.out.println("HOUR_OF_DAY:   " + cal.get(Calendar.HOUR_OF_DAY));
	        System.out.println("MINUTE:        " + cal.get(Calendar.MINUTE));

	}

}
