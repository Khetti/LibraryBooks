import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Lord of the Rings", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void hasAttributes() {
        assertEquals("The Lord of the Rings", book.getTitle());
        assertEquals("JRR Tolkien", book.getAuthor());
        assertEquals("Fantasy", book.getGenre());
    }

}
