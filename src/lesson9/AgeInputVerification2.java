package lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

// Demonstrate Multiple Catch Blocks and throw
public class AgeInputVerification2 {

	public static void main(String[] args) {
		getAge();
		System.out.println("End Program");
	}

	public static int getAge() {
		int age;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter Age: ");
			try {
				age = scanner.nextInt();
				if (age < 0) {
					throw new Exception("Negative age is invalid");
				}
				return age; // input okay so return the value & exit
			} catch (InputMismatchException e) {
				scanner.next();//remove the leftover garbage from the input buffer
				System.out.println("Input is invalid.\n" + "Please enter digits only");
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
