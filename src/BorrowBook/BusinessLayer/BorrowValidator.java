package BorrowBook.BusinessLayer;

import BorrowBook.Models.Book;

/**
 * Validates borrowing conditions.
 */
public class BorrowValidator {

    /**
     * Checks if the selected book is available.
     */
    public boolean isBookAvailable(Book book) {

        if (book == null) {
            return false;
        }

        return book.isAvailable();
    }
}