package BorrowBook.Test.businessLayer;

import BorrowBook.BusinessLayer.MemberService;
import BorrowBook.Models.Member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {

    @Test
    public void testFindExistingMember() {

        MemberService service = new MemberService();

        Member member = service.findMember(1001);

        assertNotNull(member);
    }

    @Test
    public void testInvalidMemberId() {

        MemberService service = new MemberService();

        Member member = service.findMember(-1);

        assertNull(member);
    }

    @Test
    public void testZeroMemberId() {

        MemberService service = new MemberService();

        Member member = service.findMember(0);

        assertNull(member);
    }
}
