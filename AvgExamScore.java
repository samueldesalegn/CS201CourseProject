package src.lesson3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AvgExamScore {
	


   public static void main(String[] args) {



   Scanner sc = new Scanner(System.in);

   System.out.println("Enter your first Name: ");
   String firstName = sc.nextLine();

   System.out.println("Enter your last Name: ");
   String lastName = sc.nextLine();

   System.out.println("Enter your grade value for subject A: ");
   double gradeOne = sc.nextDouble();

   System.out.println("Enter your grade values for subject B: ");
   double gradeTwo = sc.nextDouble();

   System.out.println("Enter your grade value for subject C: ");
   double gradeThree = sc.nextDouble();

   double avg = (gradeOne + gradeTwo + gradeThree)/3.0;
   DecimalFormat df = new DecimalFormat("#.00");
    
		

   System.out.println("Your full name is " + firstName + " " + lastName + "\n and the the average grade is " + df.format(avg) + "." );

   }

}
