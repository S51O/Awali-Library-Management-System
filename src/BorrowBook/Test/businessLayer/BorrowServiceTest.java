package BorrowBook.Test.businessLayer;
import BorrowBook.BusinessLayer.BorrowService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BorrowServiceTest {

    @Test
    public void testGetAllBooks() {

        BorrowService service = new BorrowService();

        assertFalse(
                service.getAllBooks().isEmpty()
        );
    }

    @Test
    public void testBorrowBook() {

        BorrowService service = new BorrowService();

        String result =
                service.borrowBook(1001, 1);

        assertNotNull(result);

        assertTrue(
                result.equals("book borrowed successfully.")
                        ||
                        result.equals("book is not available.")
        );
    }
}
