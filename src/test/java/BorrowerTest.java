import org.junit.Before;

import java.util.ArrayList;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;

    @Before
    public void before(){
        ArrayList<Book> borrowerCollection = new ArrayList<>();
        borrower = new Borrower();
    }

}
