import java.util.Scanner;

public class Book_Runner
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the title of the book: ");
        String title = input.nextLine();

        System.out.println("Enter the price of the book: ");
        double price = input.nextDouble();

        System.out.println("Enter the total number of pages of book: ");
        int pC = input.nextInt();

        Book book = new Book(title, price, pC);
        System.out.println(book.display());
    }
}
