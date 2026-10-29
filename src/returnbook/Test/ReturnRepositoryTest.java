
package ReturnBook.Test;

import ReturnBook.data.ReturnRepository;
import BorrowBook.DataLayer.BookRepository;
import BorrowBook.DataLayer.LoanRecordRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class ReturnRepositoryTest {

    @TempDir
    Path tempDir;

    // Creates a repository using temporary test files
    private ReturnRepository createRepository(
            Path bookFile, Path loanFile) {

        return new ReturnRepository(
            new BookRepository(bookFile.toString()),
            new LoanRecordRepository(loanFile.toString())
        );
    }

    // Test 1: Check whether an active loan exists
    @Test
    public void testActiveLoanExists() throws Exception {

        Path bookFile = tempDir.resolve("book");
        Path loanFile = tempDir.resolve("loans");

        Files.writeString(bookFile,
            "2,Database Systems,Test Author,1234567890,false\n");

        Files.writeString(loanFile,
            "1001,2,2026-10-27,\n");

        ReturnRepository repository =
            createRepository(bookFile, loanFile);

        assertTrue(repository.hasActiveLoan(1001, 2));
    }

    // Test 2: Check when no active loan exists
    @Test
    public void testNoActiveLoan() throws Exception {

        Path bookFile = tempDir.resolve("book");
        Path loanFile = tempDir.resolve("loans");

        Files.writeString(bookFile,
            "2,Database Systems,Test Author,1234567890,true\n");

        Files.writeString(loanFile,
            "1001,2,2026-10-27,2026-10-28\n");

        ReturnRepository repository =
            createRepository(bookFile, loanFile);

        assertFalse(repository.hasActiveLoan(1001, 2));
    }

    // Test 3: Verify the return date is saved
    @Test
    public void testMarkLoanReturned() throws Exception {

        Path bookFile = tempDir.resolve("book");
        Path loanFile = tempDir.resolve("loans");

        Files.writeString(bookFile,
            "2,Database Systems,Test Author,1234567890,false\n");

        Files.writeString(loanFile,
            "1001,2,2026-10-27,\n");

        ReturnRepository repository =
            createRepository(bookFile, loanFile);

        boolean updated = repository.markLoanReturned(
            1001, 2, "2026-10-29"
        );

        assertTrue(updated);

        assertEquals(
            "1001,2,2026-10-27,2026-10-29",
            Files.readString(loanFile).trim()
        );
    }

    // Test 4: Verify book availability is updated
    @Test
    public void testUpdateBookAvailability() throws Exception {

        Path bookFile = tempDir.resolve("book");
        Path loanFile = tempDir.resolve("loans");

        Files.writeString(bookFile,
            "2,Database Systems,Test Author,1234567890,false\n");

        Files.writeString(loanFile, "");

        ReturnRepository repository =
            createRepository(bookFile, loanFile);

        boolean updated =
            repository.updateBookAvailability(2);

        assertTrue(updated);

        assertEquals(
            "2,Database Systems,Test Author,1234567890,true",
            Files.readString(bookFile).trim()
        );
    }
    @Test
    public void testJUnitWorks() {
        assertTrue(true);
    }
}
