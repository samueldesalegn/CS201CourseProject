package src.lesson7;

public class StringImmutable {

	public static void main(String[] args) {
		// immutable String
		String word1 = "java";
		String word2 = word1.substring(0, 2); 
		String word3 = word1.replace('j', 'w');
		
		// Mutable Strings
		StringBuffer word = new StringBuffer("Java");
		word.setCharAt(0, 'D');
		word.setCharAt(1, 'i');
		System.out.println(word.toString());
	}
}
