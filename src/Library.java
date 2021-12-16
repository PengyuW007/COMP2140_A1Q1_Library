import java.lang.*;

public class Library {
    private Book[] books;
    private int numBooks;//number of books in library

    public Library() {
        books = new Book[100000000];
        numBooks = 0;
    }

    public void addBook(String last, String first, String title) {
        Book book = new Book(title, first, last);
        numBooks++;
        books[numBooks] = book;
    }//end addBook

    public int getNumBooks() {
        return numBooks;
    }

}
