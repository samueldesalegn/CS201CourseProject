package src.lesson4;

public class Fraction {
	/** the numerator of this fraction */
	private int numerator;

    /** the denominator of this fraction */
	private int denominator;

public Fraction(int num, int denom) {
        
        if (denom < 0) {
            num   = -num;
            denom = -denom;
        }
        
        if (num == 0) {
            denom = 1;
        }
        
        setNumerator(num);
        setDenominator(denom);
    }
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public static int gcd(int m, int n) {
	    int r = n % m;
    
        while (r != 0) {
            n = m;
            m = r;
            r = n % m;
        }
        return m;
    }
    
	public Fraction simplify( ) {
		Fraction simp;
		int num   = getNumerator();
		int denom = getDenominator();
		int gcd   = gcd(num, denom);
		simp = new Fraction(num/gcd, denom/gcd);
		return simp;
	}
	public Fraction add(Fraction frac) {
		int      a, b, c, d;
		Fraction sum;

		a = this.getNumerator();   //get the receiving
		b = this.getDenominator(); //object's num and denom
		
	    c = frac.getNumerator();   //get frac's num
		d = frac.getDenominator(); //and denom

		sum = new Fraction(a*d + b*c, b*d);
		return sum;
	}

	 public String toString( ) {
	      return getNumerator() + "/" + getDenominator();
	    }
}
