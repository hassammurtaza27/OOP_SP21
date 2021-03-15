public class CourseGrades implements Analyzable
{
    private GradedActivity[] grades = new GradedActivity[4];

    protected void setLab(GradedActivity obj)
    {
        GradedActivity lab = obj.copy();
        grades[0] = lab;
    }

    protected void setPassFailExam(PassFailExam obj)
    {
        PassFailExam passFail = new PassFailExam(obj);
        grades[1] = passFail;
    }

    protected void setEssay(Essay obj)
    {
        Essay essay = new Essay(obj);
        grades[2] = essay;
    }

    protected void setFinalExam(FinalExam obj)
    {
        FinalExam finalExam = new FinalExam(obj);
        grades[3] = finalExam;
    }

    public double getAverage()
    {
        double average = 0;

        for (int i = 0; i < 4; i++)
        {
            average += grades[i].getScore();
        }

        return average;
    }

    public GradedActivity getHighest()
    {
        double highest = grades[0].getScore();
        int index = 0;

        for (int i = 1; i < grades.length; i++)
        {
            if (grades[i].getScore() > highest) {
                highest = grades[i].getScore();
                index = i;
            }
        }
        return grades[index];
    }

    public GradedActivity getLowest()
    {
        double lowest = grades[0].getScore();
        int index = 0;

        for (int i = 1; i < grades.length; i++)
        {
            if (grades[i].getScore() < lowest) {
                lowest = grades[i].getScore();
                index = i;
            }
        }
        return grades[index];
    }

    public String toString()
    {
        return "Lab Activity- Marks: " + grades[0].getScore() + " Grade: " + grades[0].getGrade() +
        "\nPass Fail Exam- Marks: " + grades[1].getScore() + " Grade: " + grades[1].getGrade() +
        "\nEssay Exam- Marks: " + grades[2].getScore() + " Grade: " + grades[2].getGrade() +
        "\nFinal Exam- Marks: " + grades[3].getScore() + " Grade: " + grades[3].getGrade();
    }
}
