package BorrowBook.DataLayer;

import BorrowBook.Models.LoanRecord;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Handles saving loan records to loans.txt.
 */
public class LoanRecordRepository {

    private final String FILE_NAME = "src/BorrowBook/DataLayer/loans";

    public void saveLoanRecord(LoanRecord loan) {

        try {

            FileWriter writer =
                    new FileWriter(FILE_NAME, true);

            writer.write(
                    loan.getMemberId() + "," +
                            loan.getBookId() + "," +
                            loan.getBorrowDate() +
                            System.lineSeparator()
            );

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving loan record.");
        }
    }
}
