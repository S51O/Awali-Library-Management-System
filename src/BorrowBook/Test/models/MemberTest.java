package BorrowBook.Test.models;

import BorrowBook.Models.Member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberTest {

    @Test
    public void testMemberCreation() {

        Member member = new Member(
                1001,
                "Sakeenah"
        );

        assertEquals(
                1001,
                member.getMemberId()
        );

        assertEquals(
                "Sakeenah",
                member.getName()
        );
    }
}