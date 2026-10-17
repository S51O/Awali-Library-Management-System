
package model;

/**
 * Represents a book in the library.
 * Stores book information and availability status.
 */
public class Book {

    private String title;
    private String author;
    private String isbn;
    private String availability;

    /**
     * Creates a new book with its details.
     */
    public Book(String title, String author,
                String isbn, String availability) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = availability;
    }

    // Returns the book title.
    public String getTitle() {
        return title;
    }

    // Returns the author's name.
    public String getAuthor() {
        return author;
    }

    // Returns the ISBN.
    public String getIsbn() {
        return isbn;
    }

    // Returns the current availability status.
    public String getAvailability() {
        return availability;
    }

    /**
     * Updates availability when a book is
     * borrowed or returned.
     */
    public void setAvailability(String availability) {
        if (!availability.equals("Available")
                && !availability.equals("Borrowed")) {
            throw new IllegalArgumentException(
                "Invalid availability status");
        }

        this.availability = availability;
    }
}

