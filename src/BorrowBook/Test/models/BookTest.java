package BorrowBook.Test.models;

import BorrowBook.Models.Book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testBookCreation() {

        Book book = new Book(
                1,
                "Java Programming",
                "James Gosling",
                "9781234567890",
                true
        );

        assertEquals(1, book.getBookId());
        assertEquals("Java Programming", book.getTitle());
        assertEquals("James Gosling", book.getAuthor());
        assertEquals("9781234567890", book.getIsbn());
        assertTrue(book.isAvailable());
    }

    @Test
    public void testSetAvailable() {

        Book book = new Book(
                1,
                "Java Programming",
                "James Gosling",
                "9781234567890",
                true
        );

        book.setAvailable(false);

        assertFalse(book.isAvailable());
    }
}