public class NumberOfObjects
{
    private static int count;

    NumberOfObjects()
    {
        count++;
    }

    public static int getCount()
    {
        return count;
    }
}
