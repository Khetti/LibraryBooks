import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryCollection;
    private int capacity;

    public Library(ArrayList<Book> collection, int capacity){
        this.libraryCollection = collection;
        this.capacity = capacity;
    }


    public int stockCheck() {
        return this.libraryCollection.size();
    }

    public boolean newBook(Book book) {
        if (this.capacity > this.stockCheck()){
            return this.libraryCollection.add(book);
        } else {
            return false;
        }
    }
}
