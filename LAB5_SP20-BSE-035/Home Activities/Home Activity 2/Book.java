public class Book
{
    private String author;
    private String[] chapterNames;

    Book() {}

    Book(String author, String[] chapterNames)
    {
        this.author = author;
        this.chapterNames = new String[chapterNames.length];

        for (int i = 0; i < chapterNames.length; i++)
        {
            this.chapterNames[i] = chapterNames[i];
        }
    }

    Book(Book book) // copy constructor
    {
        this.author = book.author;
        this.chapterNames = new String[book.chapterNames.length];

        for (int i = 0; i < chapterNames.length; i++)
        {
            this.chapterNames[i] = book.chapterNames[i];
        }
    }

    void setAuthor(String author)
    {
        this.author = author;
    }

    void setChapterNames(String[] chapterNames)
    {
        this.chapterNames = new String[chapterNames.length];

        for (int i = 0; i < chapterNames.length; i++)
        {
            this.chapterNames[i] = chapterNames[i];
        }
    }

    String getAuthor()
    {
        return author;
    }


    boolean compareBooks(Book b)
    {
        return this.author.equals(b.author);
    }

    Book compareChapterNames(Book book)
    {
        if (this.chapterNames.length < book.chapterNames.length)
            return new Book(book);
        else
        {
            return new Book(new Book(author, chapterNames));
        }
    }
}


