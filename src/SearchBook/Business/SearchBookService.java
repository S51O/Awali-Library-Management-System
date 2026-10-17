
package SearchBook.Business;

import java.util.List;
import SearchBook.Data.Book;
import SearchBook.Data.BookData;

/**
 * Business layer for the Search Book use case.
 * Coordinates the search request with the data layer.
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
     * Requests books matching the given keyword.
     *
     * @param keyword the title, author, or ISBN to search for
     * @return a list of matching books
     */
    public List<Book> searchBook(String keyword) {
        return bookData.searchBooks(keyword);
    }
}
