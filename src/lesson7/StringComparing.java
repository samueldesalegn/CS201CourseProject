package lesson7;

public class StringComparing {

	public static void main(String[] args) {
		// Comparing new String() Objects using == 
		String str1 = new String("Java");
		String str2 = new String("Java");
		/* == check the references are same
		 * new String() always creates new references,
		 * even the contents are same.
		 * So that output says They are not equal
		 * */
		// CASE - A
		if (str1 == str2) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}

		// CASE - B
		 str1 = new String("Java");
		 str2 = str1; // Both str1 and str2 are same references
		// You will get the They are eqaul, because both objects referring the same
		if (str1 == str2) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}

	   //CASE - C - Efficient Approach - use equals() for the new String()
		String  s1 = new String("Java");
		String s2 = new String("Java");
		if (s1.equals(s2)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		 //CASE - D - Efficient Approach - use == for the String Literals
		String  s3 = "Literal";
		String s4 = "Literal";
		if (s3.equals(s4)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
	}

}
