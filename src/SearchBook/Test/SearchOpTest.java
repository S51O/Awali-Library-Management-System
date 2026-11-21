
package SearchBook.Test;

import SearchBook.Presentation.SearchOp;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

class SearchOpTest {

    // Helper method to run the search and capture its output
    private String runSearch(String keyword) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setIn(new ByteArrayInputStream(
                    (keyword + "\n").getBytes(StandardCharsets.UTF_8)));

            System.setOut(new PrintStream(output));

            SearchOp searchOp = new SearchOp();
            searchOp.searchBook();

            return output.toString();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    // Test 1: Search for an existing book by title
    @Test
    void testSearchBookByTitle() {
        String result = runSearch("Java Programming");

        assertTrue(result.contains("Search Book"));
        assertTrue(result.contains("Java Programming"));
        assertTrue(result.contains("John Smith"));
        assertTrue(result.contains("9780135166307"));
        assertTrue(result.contains("Borrowed"));
    }

    // Test 2: Search for a book that does not exist
    @Test
    void testSearchBookNoResults() {
        String result = runSearch("NoSuchBook123456");

        assertTrue(result.contains("Search Book"));
        assertTrue(result.contains("No books found."));
    }

    // Test 3: Search for a book using the author's name
    @Test
    void testSearchBookByAuthor() {
        String result = runSearch("Thomas Connolly");

        assertTrue(result.contains("Database Systems"));
        assertTrue(result.contains("Thomas Connolly"));
    }

    // Test 4: Search for a book using its ISBN
    @Test
    void testSearchBookByISBN() {
        String result = runSearch("9780133943030");

        assertTrue(result.contains("Software Engineering"));
        assertTrue(result.contains("Ian Sommerville"));
        assertTrue(result.contains("9780133943030"));
    }
}
