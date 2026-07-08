class Library
{
    String libraryName = "Central Library";

    class Book
    {
        String bookTitle;
        String authorName;
    
        Book(String bookTitle, String authorName)
        {
            this.bookTitle = bookTitle;
            this.authorName = authorName;
        }

        void displayBookDetails()
        {
            System.out.println("Book Title  : " + bookTitle);
            System.out.println("Author Name : " + authorName);
        }
    }

    public static void main(String[] args)
    {
        Library lib = new Library();

        Library.Book book = lib.new Book("Java Programming", "James Gosling");

        System.out.println("Library Name: " + lib.libraryName);

        book.displayBookDetails();
    }
}
