public class L5Assign_Runner
{
    public static void main(String[] args)
    {
        Fraction fraction = new Fraction(10, 10);
        Fraction fraction1 = new Fraction(5, 10);

        System.out.println("Are both fractions equal: " + fraction.equals(fraction1));

        fraction1.setDenominator(0.55);
        fraction.setNumerator(0.06);

        fraction.display();
        fraction1.display();
    }


}
