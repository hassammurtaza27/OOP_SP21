public class Pizza_Runner
{
    public static void main(String[] args) {
        Pizza p1 = new Pizza(3, 1, 1, 2);
        Pizza p2  = new Pizza(1);
        Pizza p3 = new Pizza(p1);

        p1.setCheeseToppings(5);

        System.out.println(p1);
        System.out.println("\n" + p2);
        System.out.println("\n" + p3);
    }
}
