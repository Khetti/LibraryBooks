import java.util.ArrayList;

public class Borrower {

    public ArrayList<Book> borrowerCollection;

    public Borrower(){
        this.borrowerCollection = new ArrayList<>();
    }

    public int borrowedCount() {
        return this.borrowerCollection.size();
    }

    private void borrowBook(Book bookToBorrow) {
        this.borrowerCollection.add(bookToBorrow);
    }

    public void borrowBookFromLibrary(Library library) {
        Book bookToBorrow = library.removeBook();
        borrowBook(bookToBorrow);
    }

}
