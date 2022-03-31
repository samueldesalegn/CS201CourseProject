package src.lesson2;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	public static void main(String[] args) {
		    //Local Date API and methods      
		    LocalDate today = LocalDate.now(); // Current Date
	        LocalDate tomorrow = today.plusDays(1); // Add number of days
	       
	        LocalTime timeOnly = LocalTime.now(); // Time is represented to nanosecond precision
	        LocalDateTime dateTime = LocalDateTime.now();
	        ZonedDateTime dateTimeWithZone = ZonedDateTime.now();
	        		
	        
	        System.out.println("Today is " + today);
	        System.out.println("Day of month: "  + today.getDayOfMonth());
	        System.out.println("Day of year:" + today.getDayOfYear());
	        System.out.println("Tomorrow is " + tomorrow);
	        
	          
	        System.out.println("Current Time : " + timeOnly);
	        System.out.println("Current Date and Time : " + dateTime);
	        System.out.println("Current Date and Time with Zone: " + dateTimeWithZone);
	        System.out.println("Is Leap Year : " + today.isLeapYear());

	        // To set your own date and formatting
	        LocalDate Bdate = LocalDate.of(1994, 10, 22);
	        System.out.println("Birth Date : " + Bdate );
	        String datePattern = "MM/dd/yyyy"; 
	        String formattedDate = Bdate.format(DateTimeFormatter.ofPattern(datePattern));
	        System.out.println("Formatted Birth Date :" + formattedDate);
	        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern(datePattern)));
	}

}
