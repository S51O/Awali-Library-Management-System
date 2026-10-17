
package ReturnBook;

import ReturnBook.presentation.ReturnController;
import java.util.Scanner;

public class ReturnTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ReturnController controller = new ReturnController();

        controller.startReturn(scanner);

        scanner.close();
    }
}

