import java.util.Scanner;

public class L6Assign_Runner
{
    private static void menu()
    {
        System.out.println("Enter 1, 2, 3 etc to perform any of the following action: ");
        System.out.println("1-Addition\n2-Multiplication\n3-Division\n4-Modulus\n5-Sin\n6-Cos\n7-Tan");
    }

    public static void main(String[] args)
    {
        int choice, choice1;
        double a, b;
        Scanner input = new Scanner(System.in);

        boolean yes = true;

        while (yes)
        {
            menu();
            choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter first number: ");
                    a = input.nextDouble();
                    System.out.println("Enter second number: ");
                    b = input.nextDouble();
                    System.out.println("Answer is: " + Calculator.sum(a, b));
                }
                case 2 -> {
                    System.out.println("Enter first number: ");
                    a = input.nextDouble();
                    System.out.println("Enter second number: ");
                    b = input.nextDouble();
                    System.out.println("Answer is: " + Calculator.multiply(a, b));
                }
                case 3 -> {
                    System.out.println("Enter first number: ");
                    a = input.nextDouble();
                    System.out.println("Enter second number: ");
                    b = input.nextDouble();
                    System.out.println("Answer is: " + Calculator.divide(a, b));
                }
                case 4 -> {
                    System.out.println("Enter first number: ");
                    a = input.nextDouble();
                    System.out.println("Enter second number: ");
                    b = input.nextDouble();
                    System.out.println("Answer is: " + Calculator.modulus(a, b));
                }
                case 5 -> {
                    System.out.println("Enter number: ");
                    a = input.nextDouble();
                    System.out.println("Answer is: " + Calculator.sin(a));
                }
                case 6 -> {
                    System.out.println("Enter number: ");
                    a = input.nextDouble();
                    System.out.println("Answer is: " + Calculator.cos(a));
                }
                case 7 -> {
                    System.out.println("Enter number: ");
                    a = input.nextDouble();
                    System.out.println("Answer is: " + Calculator.tan(a));
                }
                default -> System.out.println("Invalid input");
            }

            System.out.println("\nDo you want to continue or exit, enter 1 to continue and press any other key to exit: ");
            choice1 = input.nextInt();

            if (choice1 != 1)
                yes = false;
        }
    }
}
