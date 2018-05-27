package oopjava;
/**
 * @author LuiggiFernandez
 */
public class Fraction {

    private int numerator;
    private int denominator;
    
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can't be zero");
        } else if (numerator < 0 && denominator < 0) {
            this.numerator = Math.abs(numerator);
            this.denominator = Math.abs(denominator);
        } else if (numerator > 0 && denominator < 0) {
            this.numerator = numerator * -1;
            this.denominator = Math.abs(denominator);
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }
    
    public Fraction(int numerator) {
        this(numerator, 1);
    }
    
    public Fraction() {
        this(0, 1);
    }
    
    private int getNumerator() {
        return this.numerator;
    }
    
    private int getDenominator() {
        return this.denominator;
    }
    
    @Override
    public String toString() {
        String Fraction;
        if (this.numerator == this.denominator && this.numerator != 0) {
            Fraction = "1";
        } else if (this.numerator == 0) { 
            Fraction = "0";
        }
        else {
            Fraction = Integer.toString(this.numerator)+"/"+Integer.toString(this.denominator);
        }
        return Fraction;
    }
    
    public double toDouble() {
        double Fraction = this.numerator / this.denominator;
        return Fraction;
    }
    
    public Fraction add(Fraction other) {
        int newNum = (this.numerator * other.getDenominator()) + (this.denominator * other.getNumerator());
        int newDen = this.denominator * other.getDenominator();
        Fraction newFrac = new Fraction(newNum, newDen);
        newFrac.toLowestTerms();
        return newFrac;
    }
    
    public Fraction substract(Fraction other) {
        int newNum = (this.numerator * other.getDenominator()) - (this.denominator * other.getNumerator());
        int newDen = this.denominator * other.getDenominator();
        Fraction newFrac = new Fraction(newNum, newDen);
        newFrac.toLowestTerms();
        return newFrac;
    }
    
    public Fraction multiply(Fraction other) {
        int newNum = this.numerator * other.getNumerator();
        int newDen = this.denominator * other.getDenominator();
        Fraction newFrac = new Fraction(newNum, newDen);
        newFrac.toLowestTerms();
        return newFrac;
    }
    
    public Fraction divide(Fraction other) {
        int newNum = this.numerator * other.getDenominator();
        int newDen = this.denominator * other.getNumerator();
        Fraction newFrac = new Fraction(newNum, newDen);
        newFrac.toLowestTerms();
        return newFrac;
    }
    
    public boolean equals(Fraction other) {
        int newNum = this.numerator;
        int newDen = this.denominator;
        Fraction newFrac = new Fraction(newNum, newDen);
        newFrac.toLowestTerms();
        other.toLowestTerms();
        return newFrac.numerator == other.numerator && newFrac.denominator == other.denominator;
    }
    
    public void toLowestTerms() {
        int num = this.numerator;
        int den = this.denominator;
        this.numerator /= gcd(num, den);
        this.denominator /= gcd(num, den);
    }
    
    public int gcd(int numerator, int denominator) {
        int gcd;
        while (numerator != 0 && denominator != 0) {
            gcd = numerator % denominator;
            numerator = denominator;
            denominator = gcd;
        }
        if (numerator != 0) {
            return numerator;
        } else {
            return 1;
        }
    }
    
}