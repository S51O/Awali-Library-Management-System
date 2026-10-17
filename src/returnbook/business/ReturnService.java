
package ReturnBook.business;

import ReturnBook.data.ReturnRepository;
import BorrowBook.Models.Book;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Handles the business logic for returning books.
 * Validates the return and communicates with the data layer.
 */
public class ReturnService {

    private ReturnRepository returnRepository;

    /**
     * Initializes the Return Book data layer.
     */
    public ReturnService() {
        returnRepository = new ReturnRepository();
    }

    /**
     * Processes a book return.
     */
    public String returnBook(int memberId, int bookId) {

        if (memberId <= 0 || bookId <= 0) {
            return "Invalid Member ID or Book ID.";
        }

        try {
            // Step 1: Find the book.
            Book book = returnRepository.getBookById(bookId);

            if (book == null) {
                return "Book not found.";
            }

            // Step 2: Check for an active loan.
            boolean activeLoan =
                    returnRepository.hasActiveLoan(memberId, bookId);

            if (!activeLoan) {
                return "No active loan found for this member and book.";
            }

            // Step 3: Check book availability.
            if (book.isAvailable()) {
                return "Book is already marked as available.";
            }

            // Step 4: Record the return date.
            String returnDate = LocalDate.now().toString();

            boolean loanUpdated =
                    returnRepository.markLoanReturned(
                            memberId, bookId, returnDate);

            if (!loanUpdated) {
                return "Unable to update the loan record.";
            }

            // Step 5: Update book availability.
            boolean bookUpdated =
                    returnRepository.updateBookAvailability(bookId);

            if (!bookUpdated) {
                return "Unable to update book availability. "
                        + "Please check the records.";
            }

            return "Book returned successfully! "
                    + "The book is now available.";

        } catch (IOException e) {
            return "Error processing return: " + e.getMessage();

        } catch (NumberFormatException e) {
            return "Invalid data found in the library files.";
        }
    }
}


