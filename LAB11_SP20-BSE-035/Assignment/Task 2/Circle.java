public class Circle implements Shape
{
    private double radius;

    Circle(double r)
    {
        radius = r;
    }

    public double area()
    {
        return 3.14 * radius * radius;
    }
}
