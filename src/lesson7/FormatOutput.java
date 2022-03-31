package src.lesson7;

import java.util.Date;
import java.util.Formatter;

public class FormatOutput {
	public static void main(String args[]) {
		System.out.printf("You owe me $%f \n", 195.50);		
		System.out.printf("You owe me $%.2f \n", 195.5076);
		System.out.printf("You owe me $%7.2f \n", 195.50);
		String name = "Bob";
		int age = 30;
		System.out.printf("Happy birthday %s. I can't believe you're %d\n",name,age);
		String oweMe = String.format("You owe me %.2f dollars", 196f);
		String oweMe2 = String.format("You owe me %d dollars", 196);
		System.out.println(oweMe);
		System.out.println(oweMe2);
		String date = String.format("Today's date: %tD", new Date()); // Only Date
		System.out.println(date);
		String date1 = String.format("Today's date: %tc", new Date()); // Print Date and time
		System.out.println(date1);
		System.out.printf("\n%6d #%4s#%7.2f\n", 1234, "Java", 51.6653);
		
		System.out.println();
		try (Formatter formatter = new Formatter(System.out)) {
			int num1 = 34, num2 = 9;
			int num3 = num1 + num2;
			formatter.format("%3d + %3d = %5d", num1, num2, num3);
			// Simple Way - More Readable approach
			System.out.format("\n%3d + %3d = %5d", num1, num2, num3);
		}

	}
}
