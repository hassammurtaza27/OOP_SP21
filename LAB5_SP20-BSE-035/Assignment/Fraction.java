public class Fraction
{
    private double numerator;
    private double denominator;
    private double fraction;

    Fraction()
    {
        numerator = 0;
        denominator = 0;
    }

    Fraction(double x, double y)
    {
        numerator = x;
        denominator = y;
        fraction = numerator / denominator;
    }

    void setNumerator(double x)
    {
        numerator = x;
    }

    void setDenominator(double y)
    {
        denominator = y;
    }

    double getNumerator()
    {
        return numerator;
    }

    double getDenominator()
    {
        return denominator;
    }

    double getFraction()
    {
        return fraction;
    }

    void display()
    {
        System.out.println("\nNumerator: " + numerator + "\nDenominator: " + denominator + "\nRatio: " + fraction);
    }

    public boolean equals(Fraction f)
    {
        return fraction == f.getFraction();
    }
}
