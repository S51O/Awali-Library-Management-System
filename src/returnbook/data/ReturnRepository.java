
package ReturnBook.data;

import BorrowBook.DataLayer.BookRepository;
import BorrowBook.DataLayer.LoanRecordRepository;
import BorrowBook.Models.Book;

import java.io.IOException;

/**
 * Handles data operations for the Return Book use case.
 * Uses the shared book and loan repositories.
 */
public class ReturnRepository {

    private BookRepository bookRepository;
    private LoanRecordRepository loanRepository;

    /**
     * Initializes the shared repositories.
     */
    public ReturnRepository() {
        bookRepository = new BookRepository();
        loanRepository = new LoanRecordRepository();
    }

    /**
     * Finds a book using its ID.
     */
    public Book getBookById(int bookId) {
        return bookRepository.getBookById(bookId);
    }

    /**
     * Checks whether the member has an active loan.
     */
    public boolean hasActiveLoan(int memberId, int bookId)
            throws IOException {

        return loanRepository.findActiveLoan(memberId, bookId);
    }

    /**
     * Records the return date of the borrowed book.
     */
    public boolean markLoanReturned(
            int memberId, int bookId, String returnDate)
            throws IOException {

        return loanRepository.markLoanReturned(
                memberId, bookId, returnDate);
    }

    /**
     * Updates the book availability to true.
     */
    public boolean updateBookAvailability(int bookId)
            throws IOException {

        return bookRepository.updateBookAsAvailable(bookId);
    }
}

