public class PizzaOrder_Runner
{
    public static void main(String[] args) {
        PizzaOrder order1 = new PizzaOrder(2, 3, 1, 1, 2);
        System.out.println("Total Price: " + order1.calcCost());
    }
}