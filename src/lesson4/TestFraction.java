package lesson4;

public class TestFraction {

	public static void main(String[] args) {
		 Fraction f1, f2,f3;
		 f1 = new Fraction(24, 26);
		 f2 = f1.simplify();
		 System.out.println("Fraction f1 = " + f1);
		 System.out.println("Fraction f2 = " + f2);
		 f3 = f1.add(f2);
		 System.out.println("Sum of " + f1.toString() + " and " +
                 f2.toString() + " is " +
                 f3.toString());
	}
}
