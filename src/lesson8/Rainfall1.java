package src.lesson8;

import java.util.Scanner;

public class Rainfall1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        String[] monthName = { "January", "February", "March",
	                               "April", "May", "June", "July",
	                               "August", "September", "October",
	                               "November", "December"  };

	        double[]  rainfall = new double[12];

	        double    annualAverage,
	                  sum,
	                  difference;

	        sum = 0.0;

	        for (int i = 0; i < 12; i++) {

	            System.out.print("Rainfall for " + monthName[i] + ": ");
	            rainfall[i] = scanner.nextDouble();
	            
	            sum += rainfall[i];
	        }

	        annualAverage = sum / 12.0;

	        System.out.format( "Annual Average Rainfall: %5.2f", annualAverage );

	        System.out.println("\n\n");


	        for (int i = 0; i < 12; i++) {

	            System.out.format("%-12s", monthName[i]); 

	            //average rainfall for the month
	            System.out.format("%15.2f", rainfall[i]);

	            //difference between the monthly and annual averages
	            difference = Math.abs( rainfall[i] - annualAverage );
	            System.out.format("%15.2f\n", difference);
	        }

	}

}
