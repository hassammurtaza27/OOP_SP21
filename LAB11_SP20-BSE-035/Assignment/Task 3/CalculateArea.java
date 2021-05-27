import java.util.Arrays;

public class CalculateArea
{
    double[] areaOfObjects(Object[] arr)
    {
        double[] newArr = new double[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] instanceof Circle)
                newArr[i] = (((Circle) arr[i]).area());
            else if (arr[i] instanceof Triangle)
                newArr[i] = (((Triangle) arr[i]).area());
            else if (arr[i] instanceof Rectangle)
                newArr[i] = (((Rectangle) arr[i]).area());

        }

        return newArr;
    }
}
