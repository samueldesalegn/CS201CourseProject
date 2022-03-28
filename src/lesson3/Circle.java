package lesson3;
/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 3 Sample Program: Compute Area and Circumference
                              with formatting using standard
                              input and output

    File: Ch2Circle4.java

*/

import java.util.*;
import java.text.*;

class Circle {

    public static void main( String[] args ) {

        final double PI = 3.14159;
        final String TAB = "\t";
        final String NEWLINE = "\n";

        double radius, area, circumference;
        
        Scanner scanner = new Scanner(System.in);;

        DecimalFormat df = new DecimalFormat("0.000");

        //Get input
        System.out.print("Enter radius: ");
        
        radius = scanner.nextDouble();

        //Compute area and circumference
        area          = PI * radius * radius;
        circumference = 2.0 * PI * radius;

        //Display the results
        System.out.println(
                "Given Radius:  " + TAB + df.format(radius) + NEWLINE +
                "Area:          " + TAB + df.format(area)   + NEWLINE +
                "Circumference: " + TAB + df.format(circumference));
    }
}