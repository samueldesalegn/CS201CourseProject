package src.lesson3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CentimeterToFeetAndInches {
	


	public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a double value of centimeter: ");
    double c = sc.nextDouble();

		double f = 0.0328084*c;

		double i = (f - (int)f)*12;
		DecimalFormat df = new DecimalFormat("#.00000");
    
		

		System.out.println("The conversion of " + c + " centimeter is = " + (int)f + " feet and " +
		                         "\n + " + df.format(i) + " inches.");
    


	}
	
}
