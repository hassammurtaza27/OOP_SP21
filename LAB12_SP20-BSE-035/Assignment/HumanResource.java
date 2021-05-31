import java.util.ArrayList;

public class HumanResource
{
    private Association[] resources;


    public void add(Association person)
    {
        if (resources == null)
            resources = new Association[1];
        else
            extend();

        resources[resources.length-1] = person;
    }


    private void extend()
    {
        Association[] temp = new Association[resources.length + 1];

        for (int i = 0; i < resources.length; i++)
        {
            temp[i] = resources[i];
        }

        resources = temp;
    }


    public void delete(int n)
    {
        if (n < 1 || n > resources.length)
        {
            System.out.println("Index out of range!");
            return;
        }
        Association[] temp = new Association[resources.length - 1];

        for (int i = 0; i < n - 1; i++)
        {
            temp[i] = resources[i];
        }

        for (int i = n - 1; i < resources.length-1; i++)
        {
            temp[i] = resources[i+1];
        }

        resources = temp;
    }


    public String toString()
    {
        String s = "";

        for (Association association : resources) {
            s = s.concat(association.toString());
            s += "\n";
        }

        return s;
    }


    public static void main(String[] args)
    {
        Student o1 = new Student("Hassam", "035");
        Student o2 = new Student("Daud", "021");
        Student o3 = new Student("Haris", "040");

        Teacher o4 = new Teacher("Muzaffar Kolachi", "A1");
        Teacher o5 = new Teacher("Farooq Ahmed", "A2");
        Teacher o6 = new Teacher("Samina Nasir", "A3");

        /*HumanResource res0 = new HumanResource();
        res0.add(o1);
        res0.add(o2);
        res0.add(o3);
        res0.add(o4);
        res0.add(o5);
        res0.add(o6);

        res0.delete(7);

        System.out.println(res0);*/

        ArrayList<Association> res1 = new ArrayList<>();

        res1.add(o1);
        res1.add(o2);
        res1.add(o3);
        res1.add(o4);
        res1.add(o5);
        res1.add(o6);
        res1.remove(2);
        System.out.println(res1);

    }
}
