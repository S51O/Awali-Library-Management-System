package SearchBook.Data;

import java.util.ArrayList;
import java.util.List;

public class BookData {

    private List<Book> books;

    public BookData() {
        books = new ArrayList<>();

        books.add(new Book("Clean Code", "Robert C. Martin",
                "9780132350884", "Available"));

        books.add(new Book("Java Programming", "John Smith",
                "9781234567890", "Borrowed"));

        books.add(new Book("Introduction to Algorithms",
                "Thomas H. Cormen", "9780262046305", "Available"));

                 books.add(new Book(
        "Java Programming", "Herbert Schildt",
        "9781260440232", "Available"
    ));

    books.add(new Book(
        "Harry Potter and the Philosopher's Stone",
        "J.K. Rowling", "9780747532699", "Available"
    ));

    books.add(new Book(
        "The Alchemist", "Paulo Coelho",
        "9780061122415", "Borrowed"
    ));

    books.add(new Book(
        "Atomic Habits", "James Clear",
        "9780735211292", "Available"
    ));
}
    

    public List<Book> searchBooks(String keyword) {
        List<Book> results = new ArrayList<>();

        if (keyword == null || keyword.trim().isEmpty()) {
            return results;
        }

        keyword = keyword.trim().toLowerCase();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword)
                    || book.getAuthor().toLowerCase().contains(keyword)
                    || book.getIsbn().contains(keyword)) {
                results.add(book);
            }
        }

        return results;
    }
}