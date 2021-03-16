public class H4Act3_Runner
{
    public static void main(String[] args)
    {
        int[] marks = {12, 15, 10, 10, 0};
        Student student = new Student("Hassam Murtaza", marks);
        System.out.println("Student Name: " + student.getName() + "\nAverage Marks: " + student.getAverage());
    }
}
