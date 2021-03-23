public class H5Act2_Runner
{
    public static void main(String[] args)
    {

        String[] ch1 = {"zero", "one", "two"};
        String[] ch2 = {"zero", "one"};

        Book book = new Book();
        book.setAuthor("Hassam Murtaza");
        book.setChapterNames(ch1);

        Book book1 = new Book("Tony Gaddis", ch2);

        System.out.println("Is the author of both books are same: " + book.compareBooks(book1));

        Book book2 = book.compareChapterNames(book1);
        System.out.println("The author of book whose chapters are maximum is: " + book2.getAuthor());

    }
}
