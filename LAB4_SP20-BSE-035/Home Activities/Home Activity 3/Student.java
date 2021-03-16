public class Student
{
    private String name;
    private int[] result_array = new int[5];

    Student(String name, int[] result)
    {
        this.name = name;
        result_array = result;
    }

    double getAverage()
    {
        double sum = 0;

        for (int i = 0; i < 5; i++)
        {
            sum += result_array[i];
        }

        return sum / 5;
    }

    String getName()
    {
        return name;
    }
}
