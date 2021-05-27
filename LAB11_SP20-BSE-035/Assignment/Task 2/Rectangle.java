public class Rectangle implements Shape
{
    private double length, width;

    Rectangle(double l, double w)
    {
        length = l; width  = w;
    }

    public double area()
    {
        return length * width;
    }
}
