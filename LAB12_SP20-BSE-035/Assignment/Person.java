public class Person
{
    protected String name;
    protected String id;

    public Person(String n, String i)
    {
        name = n;
        id = i;
    }

    public String toString()
    {
        return "Name: " + name + "\nId: " + id;
    }
}
