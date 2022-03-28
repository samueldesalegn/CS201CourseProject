package lesson2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FindAge {

	public static void main(String[] args) {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
		 Scanner scanner = new Scanner(System.in);
	     LocalDate birthday;
	     LocalDate today = LocalDate.now();
	     System.out.println("Please enter your birthday "
                 + "in yyyy-MM-dd format (e.g. 1980-9-28): ");
         String inputDate = scanner.nextLine();
         birthday = LocalDate.parse(inputDate, formatter);
         Period age = Period.between(birthday, today); 
         System.out.println("Today you are " +  age.getYears() +
        		" years," +  age.getMonths() + " months and "
                  + age.getDays() + " days");
	}

}
