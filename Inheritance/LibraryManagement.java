abstract class LibraryItem
{
    String itemID;
    String title;
    final String libraryName = "CITY LIBRARYS ";

    // Constructor
    LibraryItem(String itemID, String title)
    {
        this.itemID = itemID;
        this.title = title;
    }

    // Final method
    final void displayItem()
    {
        System.out.println("LIBRARY NAME: " + libraryName);
        System.out.println("ITEM ID: " + itemID);
        System.out.println("TITLE: " + title);
    }

    // Abstract method
    abstract public void calculateLateFee(int lateDays, int lateFees);
}

// BOOK CLASS
class Book extends LibraryItem
{
    Book(String itemID, String title)
    {
        super(itemID, title);
    }

    public void calculateLateFee(int lateDays, int lateFees)
    {
        int totalFine = lateDays * lateFees;
        System.out.println("TOTAL FINE: " + totalFine);
    }
}

// MAGAZINE CLASS
class Magazine extends LibraryItem
{
    Magazine(String itemID, String title)
    {
        super(itemID, title);
    }

    public void calculateLateFee(int lateDays, int lateFees)
    {
        int totalFine = lateDays * lateFees;
        System.out.println("TOTAL FINE: " + totalFine);
    }
}

// MAIN CLASS
public class LibraryManagement
{
    public static void main(String[] args)
    {
        Book book = new Book("B50", "JAVA");
        book.displayItem();
        book.calculateLateFee(5, 10);

        System.out.println("----------------------");

        Magazine magazine = new Magazine("M50", "SCIENCE");
        magazine.displayItem();
        magazine.calculateLateFee(4, 5);
    }
}
