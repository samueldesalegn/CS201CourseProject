package src.lesson6;

import java.util.Scanner;

public class LoopMethods {

	public static void main(String[] args) {
	//	whileDemo();
		//getShapeSelection();
		int sum = oddSum();
		System.out.println("\n Sum = " + sum);
		
	}
	public static void whileDemo() {
		try (Scanner scanner = new Scanner(System.in)) {
			int age;
			System.out.print("Your Age (between 0 and 130): ");
			age = scanner.nextInt();
			while (age < 0 || age > 130) {
			System.out.println("An invalid age was entered. Please try again.");
			System.out.print ("Your Age (between 0 and 130): ");
			age = scanner.nextInt();
			}
			System.out.println("You Entered Age: " + age);
		}
	}
	
	public static void getShapeSelection() {
		int choice;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Selection: Enter the Shape number\n" +
			" 1 - Ellipse \n" +
			" 2 - Rectangle \n" +
			" 3 - Circle \n" +
			" 4 - Exit ");
			
			do {
			 
			 choice = scanner.nextInt();
			 switch(choice) {
			 case 1 : System.out.println("You are working with Ellipse");
			 		  break; 
			 case 2 : System.out.println("You are working with Rectangle");
			  		  break;
			 case 3 : System.out.println("You are working with Circle");
			  		  break; 
			 case 4 : System.out.println("You are Exit from the program");
			  		  System.exit(0);
			 default :System.out.println("Invalid Choice, Enter 1 to 4");
			 		  break;
			 }
			 System.out.println("Enter your choices from 1 to 4");
} while(choice>=0);
		}
		
}
	/* Suppose we need to compute the sum of odd integers entered by the user.
	We will stop the loop when the sentinel value 0 is entered, an even integer is entered,
	or the sum becomes larger than 1000*/
	public static int oddSum() {
		boolean repeat = true;
		int sum = 0, num;
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.print("Enter integer: ");
				num = scanner.nextInt();
				if (num % 2 == 0) { // invalid data
					System.out.print("Error: even number was entered");
					repeat = false;
				} else if (num == 0) { // sentinel
					System.out.print("Sum = " + sum);
					repeat = false;
				} else {
					sum += num;
					if (sum > 1000) { // pass the threshold
						System.out.print("Sum became larger than 1000");
						repeat = false;
					}
				}
			} while (repeat);
		}
		return sum;
	}

}
