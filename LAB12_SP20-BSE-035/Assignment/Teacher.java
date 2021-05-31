import java.util.Scanner;

public class Teacher extends Person implements Association
{
    private String designation;
    private String department;

    public Teacher(String n, String i)
    {
        super(n, i);
        associate();
    }

    public void associate()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the designation of teacher: ");
        designation = input.nextLine();

        System.out.println("Enter the department of teacher: ");
        department = input.nextLine();
    }

    public String toString()
    {
        return super.toString() +
                "\nDesignation: " + designation +
                "\nDepartment: "  + department;
    }
}
