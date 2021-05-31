import java.util.Scanner;

public class Student extends Person implements Association
{
    private int rollNo;
    private int semester;

    public Student(String n, String i)
    {
        super(n, i);
        associate();
    }

    public void associate()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the roll number of student: ");
        rollNo = input.nextInt();

        System.out.println("Enter the semester of student: ");
        semester = input.nextInt();
    }

    public String toString()
    {
        return super.toString() +
                "\nRoll Number: " + rollNo +
                "\nSemester: " + semester;
    }
}
