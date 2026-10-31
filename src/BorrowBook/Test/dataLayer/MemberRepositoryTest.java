package BorrowBook.Test.dataLayer;

import BorrowBook.DataLayer.MemberRepository;
import BorrowBook.Models.Member;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MemberRepositoryTest {

    @Test
    public void testGetAllMembers() {

        MemberRepository repository =
                new MemberRepository();

        List<Member> members =
                repository.getAllMembers();

        assertFalse(members.isEmpty());
    }

    @Test
    public void testGetMemberById() {

        MemberRepository repository =
                new MemberRepository();

        Member member =
                repository.getMemberById(1001);

        assertNotNull(member);
    }

    @Test
    public void testMemberNotFound() {

        MemberRepository repository =
                new MemberRepository();

        Member member =
                repository.getMemberById(9999);

        assertNull(member);
    }
}