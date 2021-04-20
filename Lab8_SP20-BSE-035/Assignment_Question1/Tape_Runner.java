import java.util.Scanner;

public class Tape_Runner
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the title of the track: ");
        String title = input.nextLine();

        System.out.println("Enter the price of the track: ");
        double price = input.nextDouble();

        System.out.println("Enter the total number of playing minutes: ");
        int pM = input.nextInt();

        Tape tape = new Tape(title, price, pM);
        System.out.println(tape.display());
    }
}
