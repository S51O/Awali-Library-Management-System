
package SearchBook.Data;

/**
 * Represents a book in the library.
 * Stores its title, author, ISBN, and availability.
 */
public class Book {

    private String title;
    private String author;
    private String isbn;
    private String availability;

    /**
     * Creates a book with the provided details.
     *
     * @param title the book title
     * @param author the book author
     * @param isbn the book ISBN
     * @param availability the current availability status
     */
    public Book(String title, String author, String isbn,
                String availability) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = availability;
    }

    /** @return the book title */
    public String getTitle() {
        return title;
    }

    /** @return the book author */
    public String getAuthor() {
        return author;
    }

    /** @return the book ISBN */
    public String getIsbn() {
        return isbn;
    }

    /** @return the book availability status */
    public String getAvailability() {
        return availability;
    }
}
