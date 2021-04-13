public class Pizza
{
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(int size, int cheeseToppings, int pepperoniToppings, int hamToppings)
    {
        switch (size) {
            case 1 -> this.size = "Small";
            case 2 -> this.size = "Medium";
            case 3 -> this.size = "Large";
        }
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public Pizza(int size)
    {
        switch (size) {
            case 1 -> this.size = "Small";
            case 2 -> this.size = "Medium";
            case 3 -> this.size = "Large";
        }
    }

    public Pizza(Pizza pizza)
    {
        this.size = pizza.size;
        this.cheeseToppings = pizza.cheeseToppings;
        this.pepperoniToppings = pizza.pepperoniToppings;
        this.hamToppings = pizza.hamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(int size) {
        switch (size) {
            case 1 -> this.size = "Small";
            case 2 -> this.size = "Medium";
            case 3 -> this.size = "Large";
        }
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calcCost()
    {
        int toppings = 2 * (cheeseToppings + pepperoniToppings + hamToppings);
        double price;

        if (size.equals("Small"))
        {
            price = 10 + toppings;
        }
        else if (size.equals("Medium"))
        {
            price = 12 + toppings;
        }
        else
        {
            price = 14 + toppings;
        }

        return price;
    }

    public String toString()
    {
        return "Size: " + size +
                "\nCheese Toppings: " + cheeseToppings +
                "\nPepperoni Toppings: " + pepperoniToppings +
                "\nHam Toppings: " + hamToppings +
                "\nPrice: " + calcCost();
    }
}