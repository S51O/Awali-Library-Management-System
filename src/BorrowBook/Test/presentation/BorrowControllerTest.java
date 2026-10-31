package BorrowBook.Test.presentation;

import BorrowBook.PresentationLayer.BorrowController;
import BorrowBook.Models.Book;
import BorrowBook.Models.Member;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BorrowControllerTest {

    @Test
    public void testControllerCreation() {

        BorrowController controller =
                new BorrowController();

        assertNotNull(controller);
    }

    @Test
    public void testRegisterMember() {

        BorrowController controller =
                new BorrowController();

        Member member =
                controller.registerMember(1001);

        assertNotNull(member);
    }

    @Test
    public void testBorrowBook() {

        BorrowController controller =
                new BorrowController();

        String result =
                controller.borrowBook(1001, 1);

        assertNotNull(result);
    }

    @Test
    public void testGetAllBooks() {

        BorrowController controller =
                new BorrowController();

        List<Book> books =
                controller.getAllBooks();

        assertFalse(books.isEmpty());
    }
}