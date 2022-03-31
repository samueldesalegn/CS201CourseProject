package src.lesson2;
/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 2 Sample Program: Reads a person's name and displays a greeting.

    File: Ch2Greetings.java
*/

import java.util.*;

class Ch2Greetings {

    public static void main(String[] args) {

        String firstName;
        String fullName;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your full name ? ");
        fullName = scanner.nextLine(); // accept characters until pressing enter
        System.out.println( "Hi, " + fullName + ". Nice to meet you.");
        
        System.out.print("What is your nick name? ");
        firstName = scanner.next( ); //accept characters up to, but not 
        							 //including, the first space
        System.out.println( "Hi, " + firstName + ". Nice to meet you.");

       
        
    }
}