public class Marks
{
    private double one, two, three;

    Marks()
    {
        one = 0;
        two = 0;
        three = 0;
    }

    Marks(double one, double two, double three)
    {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    void setOne(double one) { this.one = one; }
    void setTwo(double two) { this.two = two; }
    void setThree(double three) { this.three = three; }

    double getSum() { return one + two + three; }
}

