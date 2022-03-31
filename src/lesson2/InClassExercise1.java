package src.lesson2;

import java.util.Scanner;

public class InClassExercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first and last name please: ");  // John Abraham
        String fName = input.next(); // John
        String lName = input.next(); // Abraham
        System.out.println(fName.substring(0,1) + lName.substring(0,1)); // JA
    }
}
