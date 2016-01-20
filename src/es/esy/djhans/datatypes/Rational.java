package es.esy.djhans.datatypes;

/**
 * Created by User on 12.09.2015.
 */
public class Rational {
    long numerator, denominator;

    public Rational(int numerator, int denominator) {
        int gsd = gsd(numerator,denominator);
        this.numerator = numerator / gsd;
        this.denominator = denominator / gsd;
    }

    public Rational plus(Rational b) {
        long resultNumerator = this.numerator * b.denominator + b.numerator * this.denominator;
        long resultDenominator = this.denominator * b.denominator;
        int gsd = gsd(resultNumerator,resultDenominator);
        return new Rational((int) resultNumerator / gsd, (int) resultDenominator / gsd);
    }

    public Rational minus(Rational b) {
        long resultNumerator = this.numerator * b.denominator - b.numerator * this.denominator;
        long resultDenominator = this.denominator * b.denominator;
        int gsd = gsd(resultNumerator,resultDenominator);
        return new Rational((int) resultNumerator / gsd, (int) resultDenominator / gsd);
    }

    public Rational times(Rational b) {
        long resultNumerator = this.numerator * b.numerator;
        long resultDenominator = this.denominator * b.denominator;
        int gsd = gsd(resultNumerator,resultDenominator);
        return new Rational((int) resultNumerator / gsd, (int) resultDenominator / gsd);
    }

    public Rational divides(Rational b) {
        long resultNumerator = this.numerator * b.denominator;
        long resultDenominator = this.denominator * b.numerator;
        int gsd = gsd(resultNumerator,resultDenominator);
        return new Rational((int) resultNumerator / gsd, (int) resultDenominator / gsd);
    }

    @Override
    public String toString() {
        if (denominator == 1) return String.valueOf(numerator);
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rational rational = (Rational) o;

        return numerator == rational.numerator && denominator == rational.denominator;
    }

    @Override
    public int hashCode() {
        int result = (int) (numerator ^ (numerator >>> 32));
        result = 31 * result + (int) (denominator ^ (denominator >>> 32));
        return result;
    }

    private static int gsd(long p, long q) {
        if (q == 0) return (int) p;
        int r = (int) (p % q);
        return gsd(q, r);
    }

    public static void main(String[] args) {
        Rational r1 = new Rational(12,15);
        Rational r2 = new Rational(12,10);
        Rational sum = r1.plus(r2);
        Rational difference = r1.minus(r2);
        Rational product = r1.times(r2);
        Rational quotient = r1.divides(r2);
        System.out.println(r1 + " + " + r2 + " = " + sum);
        System.out.println(r1 + " - " + r2 + " = " + difference);
        System.out.println(r1 + " x " + r2 + " = " + product);
        System.out.println(r1 + " : " + r2 + " = " + quotient);
        System.out.println(new Rational(12,15).equals(new Rational(4,5)));
        System.out.println(gsd(-2, -10));

    }
}
