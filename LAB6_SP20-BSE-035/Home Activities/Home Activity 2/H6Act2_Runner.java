public class H6Act2_Runner
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            new NumberOfObjects();
        }

        System.out.println("Total objects created are: " + NumberOfObjects.getCount());
    }
}
