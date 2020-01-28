import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(ArrayList<Book> collection){
        this.collection = collection;
    }


    public int stockCheck() {
        return this.collection.size();
    }

    public boolean newBook(Book book) {
        if (this.capacity > this.stockCheck()){
            return this.collection.add(book);
        } else {
            return false;
        }
    }
}
