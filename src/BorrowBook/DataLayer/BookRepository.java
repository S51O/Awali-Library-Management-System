
package BorrowBook.DataLayer;

import BorrowBook.Models.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads book records from the shared text file and updates
 * book availability for Borrow Book and Return Book.
 */
public class BookRepository {

    private final String FILE_NAME =
            "src/BorrowBook/DataLayer/book";

    /**
     * Reads all book records from the text file.
     *
     * @return a list of books
     */
    public List<Book> getAllBooks() {

        List<Book> books = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",", -1);

                if (data.length < 5) {
                    continue;
                }

                int id = Integer.parseInt(data[0].trim());
                String title = data[1].trim();
                String author = data[2].trim();
                String isbn = data[3].trim();
                boolean available =
                        Boolean.parseBoolean(data[4].trim());

                books.add(new Book(
                        id, title, author, isbn, available ));
                 
                    }

        } catch (IOException e) {
            System.out.println("Error reading book file: "
                    + e.getMessage());
        }

        return books;
    }

    /**
     * Finds a book using its ID.
     *
     * @param bookId the ID of the book
     * @return the matching book, or null if not found
     */
    public Book getBookById(int bookId) {

        for (Book book : getAllBooks()) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    /**
     * Marks a book as borrowed.
     *
     * @param bookId the ID of the book to borrow
     */
    public void updateBookStatus(int bookId) {
        try {
            updateAvailability(bookId, false);
        } catch (IOException e) {
            System.out.println("Error updating book: "
                    + e.getMessage());
        }
    }

    /**
     * Marks a returned book as available.
     *
     * @param bookId the ID of the returned book
     * @return true if the book was found and updated
     * @throws IOException if reading or writing fails
     */
    public boolean updateBookAsAvailable(int bookId)
            throws IOException {
        return updateAvailability(bookId, true);
    }

    /**
     * Updates availability while preserving the book ID,
     * title, author, and ISBN.
     *
     * @param bookId the ID of the book to update
     * @param available the new availability status
     * @return true if the book was found and updated
     * @throws IOException if reading or writing fails
     */
    private boolean updateAvailability(
            int bookId, boolean available) throws IOException {

        Path path = Path.of(FILE_NAME);

        List<String> lines = Files.readAllLines(path);
        List<String> updatedLines = new ArrayList<>();

        boolean found = false;

        for (String line : lines) {

            String[] data = line.split(",", -1);

            if (data.length < 5) {
                updatedLines.add(line);
                continue;
            }

            int storedId = Integer.parseInt(data[0].trim());

            if (storedId == bookId) {
                data[4] = String.valueOf(available);
                found = true;
            }

            updatedLines.add(String.join(",", data));
        }

        if (found) {
            Files.write(path, updatedLines);
        }

        return found;
    }
}
