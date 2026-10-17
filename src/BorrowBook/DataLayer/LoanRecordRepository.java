
package BorrowBook.DataLayer;

import model.LoanRecord;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;

/**
 * Handles saving, searching, and updating loan records.
 * Used by both Borrow Book and Return Book.
 */
public class LoanRecordRepository {

    private final String FILE_NAME =
            "src/BorrowBook/DataLayer/loans";

    /**
     * Saves a new borrowing record to the loans file.
     */
    public void saveLoanRecord(LoanRecord loan) {

        try {
            FileWriter writer =
                    new FileWriter(FILE_NAME, true);

            writer.write(
                    loan.getMemberId() + "," +
                    loan.getBookId() + "," +
                    loan.getBorrowDate() + "," +
                    System.lineSeparator()
            );

            writer.close();

        } catch (IOException e) {
            System.out.println(
                    "Error saving loan record.");
        }
    }

    /**
     * Checks whether a member has an active loan
     * for the specified book.
     */
    public boolean findActiveLoan(int memberId, int bookId)
            throws IOException {

        List<String> lines = Files.readAllLines(
                Path.of(FILE_NAME));

        for (String line : lines) {
            String[] data = line.split(",", -1);

            if (data.length < 3) {
                continue;
            }

            int storedMemberId =
                    Integer.parseInt(data[0].trim());

            int storedBookId =
                    Integer.parseInt(data[1].trim());

            boolean active = data.length == 3
                    || data[3].trim().isEmpty();

            if (storedMemberId == memberId
                    && storedBookId == bookId
                    && active) {
                return true;
            }
        }

        return false;
    }

    /**
     * Records the return date for an active loan.
     * Returns true if the loan was updated.
     */
    public boolean markLoanReturned(
            int memberId, int bookId, String returnDate)
            throws IOException {

        if (returnDate == null || returnDate.isBlank()) {
            throw new IllegalArgumentException(
                    "Return date cannot be empty.");
        }

        Path path = Path.of(FILE_NAME);

        List<String> lines = Files.readAllLines(path);
        List<String> updatedLines = new ArrayList<>();

        boolean found = false;

        for (String line : lines) {
            String[] data = line.split(",", -1);

            if (data.length < 3) {
                updatedLines.add(line);
                continue;
            }

            int storedMemberId =
                    Integer.parseInt(data[0].trim());

            int storedBookId =
                    Integer.parseInt(data[1].trim());

            boolean active = data.length == 3
                    || data[3].trim().isEmpty();

            if (!found
                    && storedMemberId == memberId
                    && storedBookId == bookId
                    && active) {

                updatedLines.add(
                        data[0] + "," +
                        data[1] + "," +
                        data[2] + "," +
                        returnDate
                );

                found = true;

            } else {
                updatedLines.add(line);
            }
        }

        if (found) {
            Files.write(path, updatedLines);
        }

        return found;
    }
}

