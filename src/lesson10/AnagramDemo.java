package src.lesson10;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		String[] res = anagram("CAT");
		System.out.println("Total words: " + res.length);
		System.out.println(Arrays.toString(res));
		res = anagram("JAVA");
		System.out.println("Total words: " + res.length);
		System.out.println(Arrays.toString(res));
	}

	public static String[] anagram(String word) {
		int n = word.length();
		if (n == 1)
			return new String[] { word };
		String[] anagrams = new String[RecursiveDemo.factorial(n)];
		int j = 0;
		for (int i = 0; i < n; i++) {
			char current = word.charAt(i);
			String sub = word.substring(0, i) + word.substring(i + 1, n);
			String[] temp = anagram(sub);
			for (int k = 0; k < temp.length; k++) {
				anagrams[j] = current + temp[k];
				j++;
			}
		}
		return anagrams;
	}

}
