
package SearchBook.Test;

import SearchBook.Business.SearchBookService;
import SearchBook.Data.Book;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class SearchBookServiceTest {

    // Test 1: Search for an existing book by title
    @Test
    void testSearchBookByTitle() {
        SearchBookService service = new SearchBookService();

        List<Book> results = service.searchBook("Java Programming");

        assertFalse(results.isEmpty());
        assertTrue(results.stream().anyMatch(
                book -> book.getTitle().equals("Java Programming")));
    }

    // Test 2: Search for a book that does not exist
    @Test
    void testSearchBookNoResults() {
        SearchBookService service = new SearchBookService();

        List<Book> results = service.searchBook("NoSuchBook123456");

        assertNotNull(results);
        assertTrue(results.isEmpty());
    }

    // Test 3: Search for a book by author
    @Test
    void testSearchBookByAuthor() {
        SearchBookService service = new SearchBookService();

        List<Book> results = service.searchBook("Thomas Connolly");

        assertFalse(results.isEmpty());
        assertTrue(results.stream().anyMatch(
                book -> book.getAuthor().equals("Thomas Connolly")));
    }

    // Test 4: Search for a book by ISBN
    @Test
    void testSearchBookByISBN() {
        SearchBookService service = new SearchBookService();

        List<Book> results = service.searchBook("9780133943030");

        assertFalse(results.isEmpty());
        assertTrue(results.stream().anyMatch(
                book -> book.getIsbn().equals("9780133943030")));
    }
}
