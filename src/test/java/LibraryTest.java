import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

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
        HashMap<String, Integer> genres = new HashMap<>();
        book1 = new Book("The Lord of the Rings", "JRR Tolkien", "Fantasy");
        book2 = new Book("The Colour of Magic", "Terry Pratchett", "Fantasy");
        book3 = new Book("Animal Farm", "George Orwell", "Satire");
        book4 = new Book("The Trial", "Franz Kafka", "Philosophy");
        libraryCollection.add(book1);
        libraryCollection.add(book2);
        library = new Library(libraryCollection, 3, genres);
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
        System.out.println(book3.getGenre());
        assertEquals(false, library.newBook(book4));
    }

    @Test
    public void canGetBooksByGenre(){
        library.newBook(book3);
        assertEquals(3, library.getBooksByGenre());
    }

}
