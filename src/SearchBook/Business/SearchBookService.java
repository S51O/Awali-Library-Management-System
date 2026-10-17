
package SearchBook.Business;

import java.util.List;
import SearchBook.Data.Book;
import SearchBook.Data.BookData;

/**
 * Business layer for the Search Book use case.
 * Handles search requests and communicates with the data layer.
 */
public class SearchBookService {

    private BookData bookData;

    /**
     * Initializes the data object used to search books.
     */
    public SearchBookService() {
        bookData = new BookData();
    }

    /**
     * Searches for books by title, author, ISBN, or ID.
     *
     * @param keyword the search keyword
     * @return a list of matching books
     */
    public List<Book> searchBook(String keyword) {
        return bookData.searchBooks(keyword);
    }
}
