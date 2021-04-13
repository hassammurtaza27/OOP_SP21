public class PizzaOrder
{
    private final int count = 3;
    private Pizza[] pizzas = new Pizza[count];

    public PizzaOrder(int noOfOrders, int size, int cheeseToppings, int pepperoniToppings, int hamToppings)
    {
        if (noOfOrders <= 3)
        {
            for (int i = 0; i < noOfOrders; i++)
            {
                pizzas[i] = new Pizza(size, cheeseToppings, pepperoniToppings, hamToppings);
            }
        }
    }

    public boolean addPizza(int addPizza, int size, int cheeseToppings, int pepperoniToppings, int hamToppings)
    {
        int count = 0;
        for (int i = 0; i < 3; i++)
        {
            if (pizzas[i] != null)
                count++;
        }

        if (addPizza <= count)
        {
            for (int i = 0; i < addPizza; i++)
            {
                if (pizzas[i] != null)
                    pizzas[i] = new Pizza(size, cheeseToppings, pepperoniToppings,hamToppings);
            }
            return true;
        }

        return false;
    }

    public double calcCost()
    {
        double price = 0;
        for (int i = 0; i < 3; i++)
        {
            if (pizzas[i] != null)
                price += pizzas[i].calcCost();
        }

        return price;
    }
}



