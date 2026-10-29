
package ReturnBook.Test;

import ReturnBook.business.ReturnService;
import ReturnBook.data.ReturnRepository;
import BorrowBook.Models.Book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReturnServiceTest {

    // Test 1: Check invalid Member ID
    @Test
    public void testInvalidMemberId() {
        ReturnService service = new ReturnService();

        String result = service.returnBook(-1, 2);

        assertEquals(
            "Invalid Member ID or Book ID.",
            result
        );
    }

    // Test 2: Check invalid Book ID
    @Test
    public void testInvalidBookId() {
        ReturnService service = new ReturnService();

        String result = service.returnBook(1001, -1);

        assertEquals(
            "Invalid Member ID or Book ID.",
            result
        );
    }

    // Test 3: Check when the book does not exist
    @Test
    public void testBookNotFound() {
        ReturnRepository fake = new ReturnRepository() {
            @Override
            public Book getBookById(int bookId) {
                return null;
            }
        };

        ReturnService service = new ReturnService(fake);

        assertEquals(
            "Book not found.",
            service.returnBook(1001, 999)
        );
    }

    // Test 4: Check when the member has no active loan
    @Test
    public void testNoActiveLoan() {
        ReturnRepository fake = new ReturnRepository() {
            @Override
            public Book getBookById(int bookId) {
                return new Book(
                    2, "Database Systems",
                    "Test Author", "1234567890", false
                );
            }

            @Override
            public boolean hasActiveLoan(int memberId, int bookId) {
                return false;
            }
        };

        ReturnService service = new ReturnService(fake);

        assertEquals(
            "No active loan found for this member and book.",
            service.returnBook(1001, 2)
        );
    }

    // Test 5: Check when the book is already available
    @Test
    public void testBookAlreadyAvailable() {
        ReturnRepository fake = new ReturnRepository() {
            @Override
            public Book getBookById(int bookId) {
                return new Book(
                    2, "Database Systems",
                    "Test Author", "1234567890", true
                );
            }

            @Override
            public boolean hasActiveLoan(int memberId, int bookId) {
                return true;
            }
        };

        ReturnService service = new ReturnService(fake);

        assertEquals(
            "Book is already marked as available.",
            service.returnBook(1001, 2)
        );
    }

    // Test 6: Check a successful book return
    @Test
    public void testSuccessfulReturn() {
        ReturnRepository fake = new ReturnRepository() {
            @Override
            public Book getBookById(int bookId) {
                return new Book(
                    2, "Database Systems",
                    "Test Author", "1234567890", false
                );
            }

            @Override
            public boolean hasActiveLoan(int memberId, int bookId) {
                return true;
            }

            @Override
            public boolean markLoanReturned(
                    int memberId, int bookId, String returnDate) {
                return true;
            }

            @Override
            public boolean updateBookAvailability(int bookId) {
                return true;
            }
        };

        ReturnService service = new ReturnService(fake);

        assertEquals(
            "Book returned successfully! The book is now available.",
            service.returnBook(1001, 2)
        );
    }
}
