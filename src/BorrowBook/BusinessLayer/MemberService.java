package BorrowBook.BusinessLayer;

import BorrowBook.DataLayer.MemberRepository;
import BorrowBook.Models.Member;

/**
 * Handles member registration validation.
 */
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService() {
        memberRepository = new MemberRepository();
    }

    public Member findMember(int memberId) {
        if (memberId <= 0) {
            return null;
        }

        return memberRepository.getMemberById(memberId);
    }
}
