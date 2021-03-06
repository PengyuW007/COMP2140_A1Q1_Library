public class Book {
    private String title;
    private String first;
    private String last;
    private boolean loan;

    public Book(String title, String first, String last) {
        this.title = title;
        this.first = first;
        this.last = last;
        loan = false;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public String getFirst() {
        if(first.trim().isEmpty())//if this is space not any string
            first = "unknown";
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setLoan(boolean loanStatus) {
        loan = loanStatus;
    }

    public boolean getLoan() {
        return loan;
    }
}
