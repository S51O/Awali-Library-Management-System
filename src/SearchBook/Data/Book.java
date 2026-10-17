package SearchBook.Data;

/**
 * Represents a book displayed in search results.
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
}
