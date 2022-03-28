package lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInputVerification1 {
	
	public static void main(String[] args) {
		getAge();	
		System.out.println("End Program");
	}
	public static int getAge() {
		int    age;
		Scanner scanner = new Scanner(System.in);
        while (true) {
           System.out.println("Enter Age: ");
           try {
                age = scanner.nextInt();
                return age;
            } catch (InputMismatchException e) {
                scanner.next(); //remove the leftover garbage from the input buffer
                System.out.println("Invalid Entry. Please enter digits only.");
             }
        }
	}
}
