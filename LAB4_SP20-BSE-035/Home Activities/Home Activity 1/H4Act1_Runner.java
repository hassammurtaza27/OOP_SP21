import java.util.Scanner;

public class H4Act1_Runner
{
    public static void main(String[] args) {
        Marks[] marks = new Marks[5];

        Scanner input = new Scanner(System.in);
        double m;

        System.out.println("Enter marks of students:");

        for(int i = 1; i < 6; i++)
        {
            System.out.println("\nStudent " + i);
            marks[i-1] = new Marks();

            System.out.println("Enter marks in first subject: ");
            m = input.nextDouble();
            marks[i-1].setOne(m);

            System.out.println("Enter marks in second subject: ");
            m = input.nextDouble();
            marks[i-1].setTwo(m);

            System.out.println("Enter marks in third subject: ");
            m = input.nextDouble();
            marks[i-1].setThree(m);
        }

        for (Marks m1: marks)
        {
            System.out.println(m1.getSum());
        }

    }
}
