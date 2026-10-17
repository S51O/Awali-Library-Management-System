
import SearchBook.Presentation.SearchOp;
import BorrowBook.PresentationLayer.BorrowBookView;
import ReturnBook.presentation.ReturnController;

import java.util.Scanner;

/**
 * Main entry point for the Awali Library Management System.
 * Connects Search, Borrow, and Return functionalities.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println(
                "\n===== AWALI LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Search Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        SearchOp search = new SearchOp();
                        search.searchBook();
                        break;

                    case 2:
                        new BorrowBookView();
                        break;

                    case 3:
                        ReturnController controller =
                                new ReturnController();
                        controller.startReturn(scanner);
                        break;

                    case 4:
                        System.out.println(
                            "Thank you for using Awali Library!");
                        break;

                    default:
                        System.out.println(
                            "Invalid choice. Please try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println(
                    "Invalid input. Please enter a number.");
            }

        } while (choice != 4);

        scanner.close();
    }
}