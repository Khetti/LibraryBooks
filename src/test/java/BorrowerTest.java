import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Kitchen Confidential", "Anthony Bourdain", "Memoir");
        ArrayList<Book> libraryCollection = new ArrayList<>();
        libraryCollection.add(book);
    }

    @Test
    public void borrowerCollectionStartsEmpty(){
        assertEquals(0, borrower.borrowedCount());
    }


}
