
package SearchBook.Data;

import BorrowBook.DataLayer.BookRepository;
import java.util.ArrayList;
import java.util.List;

/**
 * Retrieves and searches book information from the shared library data.
 */
public class BookData {

    private BookRepository bookRepository;

    /**
     * Initializes the repository used to access book data.
     */
    public BookData() {
        bookRepository = new BookRepository();
    }

    /**
     * Searches for books by ID, title, author, or ISBN.
     *
     * @param keyword the search keyword
     * @return a list of matching books
     */
    public List<Book> searchBooks(String keyword) {

        List<Book> results = new ArrayList<>();

        if (keyword == null || keyword.trim().isEmpty()) {
            return results;
        }

        keyword = keyword.trim().toLowerCase();

        for (BorrowBook.Models.Book book :
                bookRepository.getAllBooks()) {

            if (String.valueOf(book.getBookId()).equals(keyword)
                    || book.getTitle().toLowerCase().contains(keyword)
                    || book.getAuthor().toLowerCase().contains(keyword)
                    || book.getIsbn().contains(keyword)) {

                results.add(new Book(
                        book.getBookId(),
                        book.getTitle(),
                        book.getAuthor(),
                        book.getIsbn(),
                        book.isAvailable()
                ));
            }
        }

        return results;
    }
}
