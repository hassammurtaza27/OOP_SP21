public class L4Act1_Runner
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("Circle 1");
        c.calculateCircumference();

        Circle c1 = new Circle();
        System.out.println("\nCircle 2");
        System.out.println("Area: " + c1.getArea());
    }
}
