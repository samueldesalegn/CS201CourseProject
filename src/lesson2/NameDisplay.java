package lesson2;
import java.util.Scanner;
public class NameDisplay {

	static String firstName, middleName, lastName, displayName, fullName;
	static int length;

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first Name: ");
		firstName = input.next();
		System.out.println("Enter your middle Name: ");
		middleName = input.next();
		
		System.out.println("Enter your last Name: ");
		lastName = input.next();
		
		// Task A
		displayName = firstName +" " + middleName.substring(0,1) + ". " + lastName;
		
		System.out.println("Your full Name is: " + displayName);

		//Task B
		fullName = firstName + " " + middleName + " " + lastName;
		System.out.println("Your full Name is: " + fullName);

			// Task C
	length = fullName.length();
	System.out.println(length);
	}	

	
}