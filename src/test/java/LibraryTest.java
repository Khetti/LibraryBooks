import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        ArrayList<Book> libraryCollection = new ArrayList<>();
        book1 = new Book("The Lord of the Rings", "JRR Tolkien", "Fantasy");
        book2 = new Book("A Brief History of Time", "Stephen Hawking", "Non-Fiction");
        book3 = new Book("Animal Farm", "George Orwell", "Satire");
        book4 = new Book("The Trial", "Franz Kafka", "Philosophy");
        libraryCollection.add(book1);
        libraryCollection.add(book2);
        library = new Library(libraryCollection, 3);
    }

    @Test
    public void hasBooks(){
        assertEquals(2, library.stockCheck());
    }

    @Test
    public void canAddBook(){
        library.newBook(book3);
        assertEquals(3, library.stockCheck());
    }

    @Test
    public void checkOverCapacity(){
        library.newBook(book3);
        assertEquals(false, library.newBook(book4));
    }

}
