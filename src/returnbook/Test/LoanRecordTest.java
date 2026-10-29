package ReturnBook.Test;

import model.LoanRecord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoanRecordTest {

    /**
     * Checks that a newly borrowed book
     * has an active loan.
     */
    @Test
    public void testNewLoanIsActive() {

        LoanRecord loan =
                new LoanRecord(1001, 2, "2026-10-27");

        assertTrue(loan.isActive());
    }

    /**
     * Checks that a loan becomes inactive
     * after the book is returned.
     */
    @Test
    public void testReturnedLoanIsInactive() {

        LoanRecord loan =
                new LoanRecord(1001, 2, "2026-10-27");

        loan.setReturnDate("2026-10-28");

        assertFalse(loan.isActive());
    }

    /**
     * Checks that an empty return date
     * is rejected.
     */
    @Test
    public void testEmptyReturnDate() {

        LoanRecord loan =
                new LoanRecord(1001, 2, "2026-10-27");

        assertThrows(
            IllegalArgumentException.class,
            () -> loan.setReturnDate("")
        );
    }
    
}