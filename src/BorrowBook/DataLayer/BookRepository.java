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
 * Handles reading book data from book.txt.
 */
public class BookRepository {

    private final String FILE_NAME =
            "src/BorrowBook/DataLayer/book";

    public List<Book> getAllBooks() {

        List<Book> books = new ArrayList<>();

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(FILE_NAME));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String title = data[1];
                boolean available = Boolean.parseBoolean(data[2]);

                books.add(new Book(id, title, available));
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error reading book file.");
        }

        return books;
    }

    public Book getBookById(int bookId) {

        List<Book> books = getAllBooks();

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                return book;
            }
        }

        return null;
    }
    public void updateBookStatus(int bookId) {

        List<Book> books = getAllBooks();

        try {

            FileWriter writer =
                    new FileWriter(FILE_NAME);

            for (Book book : books) {

                if (book.getBookId() == bookId) {
                    book.setAvailable(false);
                }

                writer.write(
                        book.getBookId() + "," +
                                book.getTitle() + "," +
                                book.isAvailable() +
                                System.lineSeparator()
                );
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error updating book.");
        }
    }
    
    /**
     * Updates a returned book's availability to true.
     * Used by the Return Book function.
     *
     * @param bookId ID of the returned book.
     * @return true if the book was updated successfully.
     */
    public boolean updateBookAsAvailable(int bookId)
            throws IOException {

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

            int storedBookId =
                    Integer.parseInt(data[0].trim());

            if (storedBookId == bookId) {

                updatedLines.add(
                        data[0] + "," +
                        data[1] + ",true"
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