package BorrowBook.PresentationLayer;

import BorrowBook.BusinessLayer.BorrowService;
import BorrowBook.BusinessLayer.MemberService;
import BorrowBook.Models.Member;
import BorrowBook.Models.Book;
import java.util.List;

/**
 * Connects the user interface with business services.
 */
public class BorrowController {

    private final BorrowService borrowService;
    private final MemberService memberService;

    public BorrowController() {
        borrowService = new BorrowService();
        memberService = new MemberService();
    }

    public Member registerMember(int memberId) {
        return memberService.findMember(memberId);
    }

    public String borrowBook(int memberId, int bookId) {
        return borrowService.borrowBook(memberId, bookId);
    }
    public List<Book> getAllBooks() {
        return borrowService.getAllBooks();
    }


}
