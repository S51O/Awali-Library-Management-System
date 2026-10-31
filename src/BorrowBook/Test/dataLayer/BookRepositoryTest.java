package BorrowBook.Test.dataLayer;

import BorrowBook.DataLayer.BookRepository;
import BorrowBook.Models.Book;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookRepositoryTest {

    @Test
    public void testGetAllBooks() {

        BookRepository repository =
                new BookRepository();

        List<Book> books =
                repository.getAllBooks();

        assertFalse(books.isEmpty());
    }

    @Test
    public void testGetBookById() {

        BookRepository repository =
                new BookRepository();

        Book book =
                repository.getBookById(1);

        assertNotNull(book);
    }

    @Test
    public void testBookNotFound() {

        BookRepository repository =
                new BookRepository();

        Book book =
                repository.getBookById(9999);

        assertNull(book);
    }

    @Test
    public void testUpdateBookAsAvailable()
            throws IOException {

        BookRepository repository =
                new BookRepository();

        boolean result =
                repository.updateBookAsAvailable(1);

        assertTrue(result);
    }
}