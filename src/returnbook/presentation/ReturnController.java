
package ReturnBook.presentation;

import ReturnBook.business.ReturnService;
import java.util.Scanner;

/**
 * Handles user interaction for returning books.
 * Connects the presentation layer to the business layer.
 */
public class ReturnController {

    private ReturnService returnService;

    /**
     * Initializes the return service.
     */
    public ReturnController() {
        returnService = new ReturnService();
    }

    /**
     * Displays the Return Book interface.
     */
    public void startReturn(Scanner scanner) {

        System.out.println("===== RETURN BOOK =====");

        try {
            // Ask the member to enter their ID.
            System.out.print("Enter Member ID: ");
            int memberId =
                    Integer.parseInt(scanner.nextLine());

            // Ask for the book being returned.
            System.out.print("Enter Book ID: ");
            int bookId =
                    Integer.parseInt(scanner.nextLine());

            // Process the return through the business layer.
            String result =
                    returnService.returnBook(memberId, bookId);

            // Display the result.
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println(
                    "Invalid input. Please enter numeric IDs.");
        }
    }
}
