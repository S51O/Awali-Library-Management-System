package model;

/**
 * Represents a borrowing transaction.
 */
public class LoanRecord {

    private int memberId;
    private int bookId;
    private String borrowDate;
    private String returnDate;

    public LoanRecord(int memberId, int bookId, String borrowDate) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDate = "";
    }

    public int getMemberId() {
        return memberId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBorrowDate() {
        return borrowDate;
    }
    
    /**
     * Returns the date when the book was returned.
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Checks whether the loan is still active.
     */
    public boolean isActive() {
        return returnDate == null || returnDate.isEmpty();
    }

    /**
     * Records the date of the book return.
     */
    public void setReturnDate(String returnDate) {
        if (returnDate == null || returnDate.isBlank()) {
            throw new IllegalArgumentException(
                "Return date cannot be empty.");
        }

        this.returnDate = returnDate;
    }

}