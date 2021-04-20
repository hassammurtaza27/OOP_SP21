public class Book extends Publications
{
    private int pageCount;

    public Book(String title, double price, int pC)
    {
        super(title, price);
        pageCount = pC;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String display()
    {
        return super.display() +
                "\nPage Count: " + pageCount;
    }
}
