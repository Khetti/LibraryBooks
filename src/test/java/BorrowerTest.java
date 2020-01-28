import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        library = new Library(libraryCollection, 100);
    }

    @Test
    public void borrowerCollectionStartsEmpty(){
        assertEquals(0, borrower.borrowedCount());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        borrower.borrowBookFromLibrary(library);
        assertEquals(0, library.stockCheck());
        assertEquals(1, borrower.borrowedCount());
    }


}
