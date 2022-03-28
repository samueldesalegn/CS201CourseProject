package lesson7;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String    name;
        int       numberOfCharacters, vowelCount = 0;
        char      letter;

        System.out.print("What is your name? ");
        name = scanner.next();

        numberOfCharacters = name.length();

        for (int i = 0; i < numberOfCharacters; i++) {

            letter = name.charAt(i);

            if (   letter == 'a' || letter == 'A' ||
                   letter == 'e' || letter == 'E' ||
                   letter == 'i' || letter == 'I' ||
                   letter == 'o' || letter == 'O' ||
                   letter == 'u' || letter == 'U'     ) {

                vowelCount++;
            }
        }

        System.out.println(name + ", your name has " +
                           vowelCount + " vowels");

    }
}
