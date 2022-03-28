package lesson7;
/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 9 Sample Program: Checks whether the input
            string is a valid identifier.

    File: Ch9MatchJavaIdentifier.java
*/

import java.util.*;

class MatchJavaIdentifier {

	public static final String VALID_IDENTIFIER_PATTERN = "[a-zA-Z][a-zA-Z0-9_$]*";

	public static void main(String[] args) {
		
		String originalText, modifiedText;

		originalText = "Vowels";    //assign string
		System.out.println("Orginal String: " + originalText);

		modifiedText = originalText.replaceAll("[aeiou]","@");
		System.out.println("Modified String: " + modifiedText);

		System.out.println("stop".equals("STOP"));
		System.out.println("stop".equalsIgnoreCase("STOP"));

		Scanner scanner = new Scanner(System.in);
		String str;
		while (true) {
			System.out.print("Identifier: ");
			str = scanner.next();
			if (str.equalsIgnoreCase("STOP"))// stop//Stop
				break;
			if (str.matches(VALID_IDENTIFIER_PATTERN)) {
				System.out.println(str + ": Valid Java identifier");

			} else {
				System.out.println(str + ": Not a valid Java identifier");
			}
		}
		System.out.println("Terminated");
	}
}