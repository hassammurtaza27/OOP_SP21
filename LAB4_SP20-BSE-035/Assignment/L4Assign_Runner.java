public class L4Assign_Runner
{
    public static void main(String[] args)
    {
        HotDogStand stand1 = new HotDogStand("H0", 5);
        HotDogStand stand2 = new HotDogStand("H1", 0);
        HotDogStand stand3 = new HotDogStand("H2", 1);

        for (int i = 1; i < 1000; i++)
        {
            if (i % 2 == 0)
                stand1.justSold();
            else
            {
                stand2.justSold();
                stand3.justSold();
            }
        }

        System.out.println("Stand ID Number: " + stand1.getIdNum() + "\nTotal sold: " + stand1.getSold());
        System.out.println("\nStand ID Number: " + stand2.getIdNum() + "\nTotal sold: " + stand2.getSold());
        System.out.println("\nStand ID Number: " + stand3.getIdNum() + "\nTotal sold: " + stand3.getSold());
    }
}
