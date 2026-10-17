package BorrowBook.BusinessLayer;

import BorrowBook.DataLayer.BookRepository;
import BorrowBook.DataLayer.LoanRecordRepository;
import BorrowBook.Models.Book;
import BorrowBook.Models.LoanRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BorrowService {

    private BookRepository bookRepository;
    private LoanRecordRepository loanRepository;
    private BorrowValidator validator;

    public BorrowService() {
        bookRepository = new BookRepository();
        loanRepository = new LoanRecordRepository();
        validator = new BorrowValidator();
    }

    public String borrowBook(int memberId, int bookId) {

        Book book = bookRepository.getBookById(bookId);

        if (!validator.isBookAvailable(book)) {
            return "book is not available.";
        }

        LoanRecord loan = new LoanRecord(
                memberId,
                bookId,
                LocalDate.now().toString()
        );

        loanRepository.saveLoanRecord(loan);
        bookRepository.updateBookStatus(bookId);

        return "book borrowed successfully.";
    }


    /**
     * Returns all books in the library.
     */
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    /**
     * Recommends available books to the member.
     */
    public List<Book> getRecommendedBooks() {

        List<Book> recommendations = new ArrayList<>();

        for (Book book : bookRepository.getAllBooks()) {
            if (book.isAvailable()) {
                recommendations.add(book);
            }

            if (recommendations.size() == 4) {
                break;
            }
        }

        return recommendations;
    }
}