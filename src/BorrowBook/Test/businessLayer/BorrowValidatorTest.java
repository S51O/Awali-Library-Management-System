package BorrowBook.Test.businessLayer;

import BorrowBook.BusinessLayer.BorrowValidator;
import BorrowBook.Models.Book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BorrowValidatorTest {

    @Test
    public void testAvailableBook() {

        Book book = new Book(
                1,
                "Java Programming",
                "James Gosling",
                "9781234567890",
                true
        );

        BorrowValidator validator =
                new BorrowValidator();

        assertTrue(
                validator.isBookAvailable(book)
        );
    }

    @Test
    public void testUnavailableBook() {

        Book book = new Book(
                2,
                "Database Systems",
                "Elmasri",
                "9789876543210",
                false
        );

        BorrowValidator validator =
                new BorrowValidator();

        assertFalse(
                validator.isBookAvailable(book)
        );
    }

    @Test
    public void testNullBook() {

        BorrowValidator validator =
                new BorrowValidator();

        assertFalse(
                validator.isBookAvailable(null)
        );
    }
}