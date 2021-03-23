public class Complex
{
    private double real;
    private double image;

    public Complex()
    {
        real = 0.0;
        image = 0.0;
    }

    public Complex(double r, double im)
    {
        real = r;
        image = im;
    }
    public Complex add(Complex b)
    {
        Complex c_new = new Complex(real + b.real, image + b.image);
        return c_new;
    }

    public void show()
    {
        System.out.println(real + "\n" + image);
    }
}
