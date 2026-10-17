package BorrowBook.Models;

/**
 * Represents a borrowing transaction.
 */
public class LoanRecord {

    private int memberId;
    private int bookId;
    private String borrowDate;

    public LoanRecord(int memberId, int bookId, String borrowDate) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
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
}
