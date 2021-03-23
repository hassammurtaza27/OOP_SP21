public class H5Act1_Runner
{
    public static void main(String[] args)
    {
        Distance distance = new Distance();
        distance.setFeet(5);
        distance.setInches(10);

        Distance distance1 = new Distance(10, 15);

        Distance distance2 = distance.addDistance(distance1);

        distance2.display();

    }
}
