
package SearchBook.Presentation;

import java.util.List;
import java.util.Scanner;
import SearchBook.Business.SearchBookService;
import SearchBook.Data.Book;

/**
 * Presentation layer for the Search Book use case.
 * Handles user input and displays matching books.
 */
public class SearchOp {

    private SearchBookService searchBookService;
    private Scanner scanner;

    /**
     * Initializes the search service and scanner.
     */
    public SearchOp() {
        searchBookService = new SearchBookService();
        scanner = new Scanner(System.in);
    }

    /**
     * Asks the user for a title, author, or ISBN,
     * searches for matching books, and displays the results.
     */
    public void searchBook() {
        System.out.println("===== Search Book =====");
        System.out.print("Enter book title, author, or ISBN: ");

        String keyword = scanner.nextLine();

        // Send the search request to the business layer.
        List<Book> results = searchBookService.searchBook(keyword);

        // Display the matching books or a message if none are found.
        if (results.isEmpty()) {
            System.out.println("No books found.");
        } else {
            System.out.println("\nSearch Results:");

            for (Book book : results) {
                System.out.println("-------------------------");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println(
                    "Availability: " + book.getAvailability()
                );
            }
        }
    }
}
