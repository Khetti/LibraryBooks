import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> libraryCollection;
    private int capacity;
    private HashMap<String, Integer> genres;


    public Library(ArrayList<Book> libraryCollection, int capacity, HashMap<String, Integer> genres) {
        this.libraryCollection = libraryCollection;
        this.capacity = capacity;
        this.genres = genres;
    }


    public int stockCheck() {
        return this.libraryCollection.size();
    }

    public boolean newBook(Book book) {
        if (this.capacity > this.stockCheck()) {
            return this.libraryCollection.add(book);
        } else {
            return false;
        }
    }

    public Book removeBook() {
        return this.libraryCollection.remove(0);
    }

    public int getBooksByGenre() {
        for (int i = 0; i < stockCheck(); i++) {
            String genre = this.libraryCollection.get(i).getGenre();
            if (genres.get(genre) == null) {
                genres.put(genre, 1);
            } else {
                genres.replace(genre, 2);
            }
        }
        return genres.size();
    }
}


