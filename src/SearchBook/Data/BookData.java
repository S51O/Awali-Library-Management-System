package SearchBook.Data;

import BorrowBook.DataLayer.BookRepository;
import java.util.ArrayList;
import java.util.List;

/**
 * Retrieves book information from the shared library data.
 */
public class BookData {

    private BookRepository bookRepository;

    public BookData() {
        bookRepository = new BookRepository();
    }

    public List<Book> searchBooks(String keyword) {

        List<Book> results = new ArrayList<>();

        if (keyword == null || keyword.trim().isEmpty()) {
            return results;
        }

        keyword = keyword.trim().toLowerCase();

        for (BorrowBook.Models.Book book :
                bookRepository.getAllBooks()) {

            if (book.getTitle().toLowerCase().contains(keyword)
                    || String.valueOf(book.getBookId()).equals(keyword)) {

                results.add(new Book(
                        book.getBookId(),
                        book.getTitle(),
                        book.isAvailable()
                ));
            }
        }

        return results;
    }
}