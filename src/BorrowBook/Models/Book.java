package BorrowBook.Models;

/**
 * Represents a book in the library.
 */
public class Book {

    private int bookId;
    private String title;
    private boolean available;

    public Book(int bookId, String title, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.available = available;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}