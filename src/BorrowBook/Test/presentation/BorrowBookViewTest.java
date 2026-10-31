package BorrowBook.Test.presentation;

import BorrowBook.PresentationLayer.BorrowBookView;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BorrowBookViewTest {

    @Test
    public void testViewCreation() {

        BorrowBookView view =
                new BorrowBookView();

        assertNotNull(view);

        view.dispose();
    }
}