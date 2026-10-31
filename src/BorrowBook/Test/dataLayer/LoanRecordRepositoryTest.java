package BorrowBook.Test.dataLayer;

import BorrowBook.DataLayer.LoanRecordRepository;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class LoanRecordRepositoryTest {

    @Test
    public void testFindActiveLoan() throws IOException {

        LoanRecordRepository repository =
                new LoanRecordRepository();

        boolean result =
                repository.findActiveLoan(1001, 1);

        assertNotNull(result);
    }

    @Test
    public void testLoanNotFound() throws IOException {

        LoanRecordRepository repository =
                new LoanRecordRepository();

        boolean result =
                repository.findActiveLoan(9999, 9999);

        assertFalse(result);
    }

    @Test
    public void testMarkLoanReturned() throws IOException {

        LoanRecordRepository repository =
                new LoanRecordRepository();

        boolean result =
                repository.markLoanReturned(
                        1001,
                        1,
                        "2026-10-31"
                );

        assertNotNull(result);
    }

    @Test
    public void testEmptyReturnDate() {

        LoanRecordRepository repository =
                new LoanRecordRepository();

        assertThrows(
                IllegalArgumentException.class,
                () -> repository.markLoanReturned(
                        1001,
                        1,
                        ""
                )
        );
    }
}