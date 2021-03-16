public class L4Act3_Runner
{
    public static void main(String[] args)
    {
        System.out.println("First point");
        Point p1 = new Point();
        p1.setX(5);
        p1.setY(4);
        p1.display();

        System.out.println("\nSecond Point");
        Point p2 = new Point(10, 11);
        p2.movePoint(2, 3);
        p2.display();

    }
}
