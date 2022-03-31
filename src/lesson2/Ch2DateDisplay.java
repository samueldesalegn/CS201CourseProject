package src.lesson2;


/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 2 Sample Program: Displays Formatted Date Information

    File: Ch2DateDisplay.java

*/

import java.util.*;  //for Date
import java.text.*;  //for SimpleDateFormat

class Ch2DateDisplay {

    public static void main(String[] args) {

        Date today;

        SimpleDateFormat simpleDF1, simpleDF2;

        today     = new Date();

        simpleDF1 = new SimpleDateFormat( );
        simpleDF2 = new SimpleDateFormat("EEEE MMMM dd, yyyy");


        //Default short format display
        System.out.println("Today is " + simpleDF1.format(today) );

        //Programmer-designated long format display
        System.out.println("Today is " + simpleDF2.format(today) );

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");

        String formattedDate = sdf.format(date);

        System.out.println("Today is " + formattedDate);	
        
    }
}