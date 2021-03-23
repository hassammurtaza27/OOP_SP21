public class Distance
{
    private double feet;
    private double inches;

    Distance()
    {
        feet = 0;
        inches = 0;
    }

    Distance(double feet, double inches)
    {
        this.feet = feet;
        this.inches = inches;
    }

    Distance addDistance(Distance d)
    {
        return new Distance(feet + d.feet, inches + d.inches);
    }

    void setFeet(double feet)
    {
        this.feet = feet;
    }

    void setInches(double inches)
    {
        this.inches = inches;
    }

    double getFeet()
    {
        return feet;
    }

    double getInches()
    {
        return inches;
    }

    void display()
    {
        System.out.println("Feet: " + feet + "\nInches: " + inches);
    }
}
