package src.lesson3;

public class TypeCasting {

	public static void main(String[] args) {
		int a;
		double x;
		short b;
		a = 17;
		x = a; // OK; A is converted to a double
	//	b = a; // illegal; no automatic conversion from int to short
		b = (short)a; // OK; A is explicitly type cast to a value of type short
		// Convert String to Numeric
		String s ="10";
		int s1 = Integer.parseInt(s);
		String num = "12.5";
		int s2 = Integer.parseInt(num); // Throws NumberFormatException, cannot convert double to int
		double d = Double.parseDouble(num); // To fix the Exception
	}

}
