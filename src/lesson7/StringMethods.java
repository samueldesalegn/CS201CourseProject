package lesson7;

public class StringMethods {

	public static void main(String[] args) {
		String c = "Problem Solving";
		String s = "Java Programming";
		
		// chatAt() - Return the character at the position
		System.out.println("CharAt");
		System.out.println(c.charAt(0)); // P
		System.out.println(c.charAt(c.length()-1)); // Last Char g
		//System.out.println(c.charAt(18)); // Throw Exception
		
		// compareTo() - Return int - +VE greater, -VE - Smaller, 0 - Equal
		System.out.println("CompareTo");
		System.out.println(c.compareTo(s));
		System.out.println(s.compareTo(c));
		System.out.println("Java".compareTo("Java"));
		// System.out.println(c.compareTo(null)); //NullPointerException
		
		System.out.println("SubString");
		System.out.println(s.substring(0,4)); // Exclude the upper limit
		System.out.println(s.substring(5)); // from 5 to end
		
		System.out.println("Trim Space before and after");
		String x = "       Java Code         ";
		System.out.println(x.trim());
		
		// Convert number to String - String.valueOf
		System.out.println("valueOf");
		int num = 1234;
		String res = String.valueOf(num);
		System.out.println(res);
		System.out.println(String.valueOf(344.56));
		
		// startWith = Return true or false
		System.out.println("startsWith");
		System.out.println(c.startsWith("P"));
		System.out.println(s.startsWith("Java"));
		System.out.println(c.startsWith("J"));
		
		// endsWith = Return true or false
		System.out.println("endsWith");
		System.out.println(c.endsWith("g"));
		System.out.println(s.endsWith("ing"));
			
	}

}
