public class Point
{
    private int x;
    private int y;

    public Point()
    {
        x = 5;
        y = 6;
    }

    public Point(int a, int c)
    {
        x = a;
        y = c;
    }

    public void setX(int a)
    {
        x = a;
    }

    public void setY(int c)
    {
        y = c;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public Point add(Point Pa, Point Pb)
    {
        Point p_new = new Point(x + Pa.x + Pb.x, y + Pa.y + Pb.y);
        return p_new;
    }

    public void display()
    {
        System.out.println(x +"\n" + y);
    }
}
