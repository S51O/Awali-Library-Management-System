package SearchBook.Presentation;

import java.util.List;
import java.util.Scanner;
import SearchBook.Business.SearchBookService;
import SearchBook.Data.Book;

/**
 * Presentation layer for searching books.
 */
public class SearchOp {

    private SearchBookService searchBookService;
    private Scanner scanner;

    public SearchOp() {
        searchBookService = new SearchBookService();
        scanner = new Scanner(System.in);
    }

    public void searchBook() {

        System.out.println("===== Search Book =====");
        System.out.print("Enter book title or ID: ");

        String keyword = scanner.nextLine();

        List<Book> results = searchBookService.searchBook(keyword);

        if (results.isEmpty()) {
            System.out.println("No books found.");
        } else {

            System.out.println("\nSearch Results:");

            for (Book book : results) {

                System.out.println("-------------------------");
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("Title: " + book.getTitle());
                System.out.println(
                        "Availability: " +
                        (book.isAvailable() ? "Available" : "Borrowed")
                );
            }
        }
    }
}
