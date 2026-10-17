package BorrowBook.DataLayer;

import BorrowBook.Models.Member;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads and searches library members.
 */
public class MemberRepository {

    private final String FILE_NAME =
            "src/BorrowBook/DataLayer/members";

    public List<Member> getAllMembers() {

        List<Member> members = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",", 2);

                if (data.length != 2) {
                    continue;
                }

                try {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();

                    if (!name.isEmpty()) {
                        members.add(new Member(id, name));
                    }

                } catch (NumberFormatException e) {
                    // Skip a row with an invalid member ID.
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading members file.");
        }

        return members;
    }

    public Member getMemberById(int memberId) {

        for (Member member : getAllMembers()) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }

        return null;
    }
}