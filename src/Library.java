import java.lang.*;
import java.util.*;

public class Library {
    private ArrayList<Book> books;
    private int numBooks;//number of books in library
    private ArrayList<Book> rent;

    public Library() {
        books = new ArrayList<>();
        numBooks = getNumBooks();
        rent = new ArrayList<>();
    }

    /*************
     getters
     **************/
    public int getNumBooks() {
        return books.size();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    /*****
     Key methods
     ******/
    public void addBook(String last, String first, String title) {
        Book book = new Book(title, first, last);
        books.add(book);
    }//end addBook


    /***
     *
     * @param last
     * @return list of books written by "last" this user
     */
    public ArrayList<Book> listByAuthor(String last) {
        System.out.println("Books by " + last + ":");
        ArrayList<Book> authors = new ArrayList<>();

        for (int i = 0; i < getNumBooks(); i++) {
            Book book = books.get(i);

            if (book.getLast().equals(last)) {
                authors.add(book);
            }
        }
        return authors;
    }//end listByAuthor

    /**
     * @param title
     * @return list of books with the same title
     */
    public ArrayList<Book> listByTitle(String title) {
        System.out.println("Books named " + title + ":");

        ArrayList<Book> titles = new ArrayList<>();

        for (int i = 0; i < getNumBooks(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                titles.add(book);
            }
        }
        return titles;
    }//end listByTitle


    /**
     * @param last
     * @param title
     * @return whether it is loanable
     */
    public boolean loanBook(String last, String title) {
        System.out.println("Book loaned:");
        boolean loaned = true;//in lib

        for (int i = 0; i < getNumBooks(); i++) {
            Book book = books.get(i);

            if (book.getLast().equals(last) && book.getTitle().equals(title)) {
                loaned = false;//update status to be borrowed
                book.setLoan(true);
                String line = getBook(last, title);
                System.out.println(line.trim());
                books.remove(book);
                rent.add(book);
            }
        }
        return loaned;
    }//end loanBook

    public boolean returnBook(String last, String title) {
        System.out.println("Book returned:");

        boolean returned = false;

        for (int i = 0; i < rent.size(); i++) {
            Book book = rent.get(i);

            if (book.getLast().equals(last) && book.getTitle().equals(title)) {
                returned = true;
                book.setLoan(false);
                books.add(book);
                String line = getBook(last, title);
                System.out.println(line.trim());
                rent.remove(book);
            }
        }
        return returned;
    }

    /**
     * Helper method
     */
    /*****
     *
     * @param last
     * @param title
     * @return details of book
     */
    public String getBook(String last, String title) {
        String res = "";
        for (int i = 0; i < getNumBooks(); i++) {
            Book book = books.get(i);
            if (book.getLast().equals(last) && book.getTitle().equals(title)) {
                res = book.getLast() + ", " + book.getFirst() + ", " + book.getTitle();
            }
        }

        return res;
    }//end getBook
}
