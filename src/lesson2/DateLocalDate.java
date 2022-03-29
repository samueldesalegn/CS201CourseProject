package lesson2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class DateLocalDate {

	public static void main(String[] args) {

		//Task A
		//Local Date API and methods      
		LocalDate today = LocalDate.now(); // Current Date
		String datePattern = "MMMM dd, yyyy"; 
	        String formattedDate = today.format(DateTimeFormatter.ofPattern(datePattern));
		
		// Any other date
		LocalDate anyDate = LocalDate.of(2022, 7, 4);
		String formattedDate2 = anyDate.format(DateTimeFormatter.ofPattern(datePattern));
		System.out.println("Today is " + formattedDate);
		System.out.println("The Independence day is " + formattedDate2);
		


		// Task B 
		Date toDay = new Date( );
                SimpleDateFormat sdf;
                sdf= new SimpleDateFormat( "dd MMMM  yyyy" );
                System.out.println("Today is " + sdf.format(toDay) );

	}
}
