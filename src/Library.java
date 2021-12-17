import java.lang.*;
import java.util.*;

public class Library {
    private ArrayList<Book>books;
    private int numBooks;//number of books in library

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String last, String first, String title) {
        Book book = new Book(title, first, last);
        books.add(book);
    }//end addBook

    public int getNumBooks() {
        return books.size();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> listByAuthor(String last) {
        System.out.println("Books by " + last + ":");
        ArrayList<Book>authors = new ArrayList<>();

        for (int i = 0; i < getNumBooks(); i++) {
            Book book =books.get(i);

            if(book.getLast().equals(last)){
                authors.add(book);
            }
        }
        return authors;
    }


}
