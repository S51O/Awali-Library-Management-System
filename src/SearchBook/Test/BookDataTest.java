
package SearchBook.Test;

import SearchBook.Data.Book;
import SearchBook.Data.BookData;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class BookDataTest {

    // Test 1: Search for a book by title
    @Test
    void testSearchBooksByTitle() {
        BookData bookData = new BookData();

        List<Book> results = bookData.searchBooks("Java Programming");

        assertFalse(results.isEmpty());
        assertTrue(results.stream().anyMatch(
                book -> book.getTitle().equals("Java Programming")));
    }

    // Test 2: Search for a book by author
    @Test
    void testSearchBooksByAuthor() {
        BookData bookData = new BookData();

        List<Book> results = bookData.searchBooks("John Smith");

        assertFalse(results.isEmpty());
        assertTrue(results.stream().anyMatch(
                book -> book.getAuthor().equals("John Smith")));
    }

    // Test 3: Search for a book by ISBN
    @Test
    void testSearchBooksByISBN() {
        BookData bookData = new BookData();

        List<Book> results = bookData.searchBooks("9780135166307");

        assertFalse(results.isEmpty());
        assertTrue(results.stream().anyMatch(
                book -> book.getIsbn().equals("9780135166307")));
    }

    // Test 4: Search for a book by ID
    @Test
    void testSearchBooksByID() {
        BookData bookData = new BookData();

        List<Book> results = bookData.searchBooks("1");

        assertFalse(results.isEmpty());
        assertTrue(results.stream().anyMatch(
                book -> book.getBookId() == 1));
    }

    // Test 5: Search for a book that does not exist
    @Test
    void testSearchBooksNoResults() {
        BookData bookData = new BookData();

        List<Book> results = bookData.searchBooks("NoSuchBook123456");

        assertNotNull(results);
        assertTrue(results.isEmpty());
    }

    // Test 6: Search using empty input
    @Test
    void testSearchBooksEmptyInput() {
        BookData bookData = new BookData();

        List<Book> results = bookData.searchBooks("");

        assertNotNull(results);
        assertTrue(results.isEmpty());
    }

    // Test 7: Search using null input
    @Test
    void testSearchBooksNullInput() {
        BookData bookData = new BookData();

        List<Book> results = bookData.searchBooks(null);

        assertNotNull(results);
        assertTrue(results.isEmpty());
    }
}
