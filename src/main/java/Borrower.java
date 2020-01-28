import java.util.ArrayList;

public class Borrower {

    public ArrayList<Book> borrowerCollection;

    public Borrower(){
        this.borrowerCollection = new ArrayList<>();
    }

    public int borrowedCount() {
        return this.borrowerCollection.size();
    }
}
