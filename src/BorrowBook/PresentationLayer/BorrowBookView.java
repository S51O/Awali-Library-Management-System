package BorrowBook.PresentationLayer;

import BorrowBook.Models.Member;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BorrowBookView extends JFrame {

    private final BorrowController controller;
    private final CardLayout cardLayout;
    private final JPanel mainPanel;

    private JTextField memberIdField;
    private JTextField bookIdField;
    private JLabel memberMessage;
    private JLabel resultLabel;

    private Member currentMember;

    private final Color darkGreen = new Color(35, 91, 62);
    private final Color lightGreen = new Color(232, 244, 235);
    private final Color white = Color.WHITE;

    public BorrowBookView() {

        controller = new BorrowController();
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        setTitle("Awali Library - Borrow Book");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(420, 380));
        setSize(650, 480);
        setLocationRelativeTo(null);

        mainPanel.add(createRegistrationPanel(), "registration");
        mainPanel.add(createBorrowPanel(), "borrow");

        add(mainPanel);
        getContentPane().setBackground(lightGreen);

        cardLayout.show(mainPanel, "registration");
        setVisible(true);
    }

    private JPanel createRegistrationPanel() {

        JPanel panel = new JPanel(new BorderLayout(15, 15));
        panel.setBackground(lightGreen);
        panel.setBorder(new EmptyBorder(30, 35, 30, 35));

        JLabel title = new JLabel(
                "Awali Library",
                SwingConstants.CENTER
        );
        title.setFont(new Font("SansSerif", Font.BOLD, 28));
        title.setForeground(darkGreen);

        JLabel subtitle = new JLabel(
                "Enter your Member ID to continue",
                SwingConstants.CENTER
        );
        subtitle.setFont(new Font("SansSerif", Font.PLAIN, 15));

        JPanel heading = new JPanel(new GridLayout(2, 1, 5, 5));
        heading.setOpaque(false);
        heading.add(title);
        heading.add(subtitle);

        JPanel form = new JPanel(new GridBagLayout());
        form.setBackground(white);
        form.setBorder(new EmptyBorder(25, 20, 25, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 5, 8, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;

        JLabel memberLabel = new JLabel("Member ID");
        memberLabel.setFont(new Font("SansSerif", Font.BOLD, 15));

        memberIdField = new JTextField(18);
        memberIdField.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JButton registerButton = new JButton("Register / Continue");
        styleButton(registerButton);

        memberMessage = new JLabel(" ");
        memberMessage.setForeground(Color.RED);

        gbc.gridx = 0;
        gbc.gridy = 0;
        form.add(memberLabel, gbc);

        gbc.gridy = 1;
        form.add(memberIdField, gbc);

        gbc.gridy = 2;
        form.add(registerButton, gbc);

        gbc.gridy = 3;
        form.add(memberMessage, gbc);

        registerButton.addActionListener(e -> registerMember());

        memberIdField.addActionListener(e -> registerMember());

        panel.add(heading, BorderLayout.NORTH);
        panel.add(form, BorderLayout.CENTER);

        return panel;
    }

    private JPanel createBorrowPanel() {

        JPanel panel = new JPanel(new BorderLayout(12, 12));
        panel.setBackground(lightGreen);
        panel.setBorder(new EmptyBorder(20, 25, 20, 25));

        JLabel title = new JLabel(
                "Welcome to Awali Library",
                SwingConstants.CENTER
        );
        title.setFont(new Font("SansSerif", Font.BOLD, 24));
        title.setForeground(darkGreen);

        JPanel top = new JPanel(new BorderLayout());
        top.setOpaque(false);
        top.add(title, BorderLayout.CENTER);

        JLabel memberLabel = new JLabel("Member ID: ");
        memberLabel.setFont(new Font("SansSerif", Font.BOLD, 14));

        JLabel memberName = new JLabel();
        memberName.setText(
                currentMember == null ? "" : currentMember.getName()
        );
        memberName.setFont(new Font("SansSerif", Font.PLAIN, 14));

        JPanel memberPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        memberPanel.setOpaque(false);
        memberPanel.add(memberLabel);
        memberPanel.add(memberName);

        top.add(memberPanel, BorderLayout.SOUTH);

        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setBackground(lightGreen);

        JLabel recommendationTitle =
                new JLabel("Recommended for You");

        recommendationTitle.setFont(
                new Font("SansSerif", Font.BOLD, 19)
        );
        recommendationTitle.setForeground(darkGreen);
        recommendationTitle.setAlignmentX(Component.LEFT_ALIGNMENT);

        content.add(recommendationTitle);
        content.add(Box.createVerticalStrut(10));

        JPanel recommendedCards = createBookCards(
                controller.getRecommendedBooks()
        );

        recommendedCards.setAlignmentX(Component.LEFT_ALIGNMENT);
        content.add(recommendedCards);
        content.add(Box.createVerticalStrut(20));

        JLabel allBooksTitle = new JLabel("Available Books");
        allBooksTitle.setFont(new Font("SansSerif", Font.BOLD, 19));
        allBooksTitle.setForeground(darkGreen);
        allBooksTitle.setAlignmentX(Component.LEFT_ALIGNMENT);

        content.add(allBooksTitle);
        content.add(Box.createVerticalStrut(10));

        JPanel allBookCards = createBookCards(
                controller.getAllBooks()
        );

        allBookCards.setAlignmentX(Component.LEFT_ALIGNMENT);
        content.add(allBookCards);

        JScrollPane scrollPane = new JScrollPane(content);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getViewport().setBackground(lightGreen);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        JPanel bottom = new JPanel(new GridBagLayout());
        bottom.setBackground(white);
        bottom.setBorder(new EmptyBorder(10, 10, 10, 10));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel bookLabel = new JLabel("Book ID:");
        bookLabel.setFont(new Font("SansSerif", Font.BOLD, 14));

        bookIdField = new JTextField(10);
        bookIdField.setFont(new Font("SansSerif", Font.PLAIN, 15));

        JButton borrowButton = new JButton("Borrow Book");
        styleButton(borrowButton);

        resultLabel = new JLabel(" ");
        resultLabel.setForeground(darkGreen);

        gbc.gridx = 0;
        gbc.gridy = 0;
        bottom.add(bookLabel, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        bottom.add(bookIdField, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0;
        bottom.add(borrowButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        bottom.add(resultLabel, gbc);

        borrowButton.addActionListener(e -> borrowBook());
        bookIdField.addActionListener(e -> borrowBook());

        panel.add(top, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(bottom, BorderLayout.SOUTH);

        return panel;
    }
    private JPanel createBookCards(
            java.util.List<BorrowBook.Models.Book> books) {

        JPanel cards = new JPanel(new GridLayout(0, 3, 12, 12));
        cards.setBackground(lightGreen);

        for (BorrowBook.Models.Book book : books) {

            if (!book.isAvailable()) {
                continue;
            }

            JPanel card = new JPanel(new BorderLayout(5, 8));
            card.setBackground(white);
            card.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(
                            new Color(200, 220, 205)
                    ),
                    new EmptyBorder(8, 8, 8, 8)
            ));

            JLabel imageLabel = new JLabel(
                    "Book " + book.getBookId(),
                    SwingConstants.CENTER
            );

            imageLabel.setPreferredSize(new Dimension(130, 110));

            String imagePath =
                    "src/BorrowBook/images/"
                            + book.getBookId() + ".jpg";

            java.io.File imageFile = new java.io.File(imagePath);

            if (imageFile.exists()) {
                ImageIcon original = new ImageIcon(imagePath);

                Image scaled = original.getImage().getScaledInstance(
                        130, 110, Image.SCALE_SMOOTH
                );

                imageLabel.setText("");
                imageLabel.setIcon(new ImageIcon(scaled));
            }

            JLabel nameLabel = new JLabel(
                    "<html><center>"
                            + book.getTitle()
                            + "<br>Book ID: "
                            + book.getBookId()
                            + "</center></html>",
                    SwingConstants.CENTER
            );

            nameLabel.setFont(new Font("SansSerif", Font.BOLD, 13));

            JButton selectButton = new JButton("Select Book");
            selectButton.setForeground(darkGreen);

            selectButton.addActionListener(e ->
                    bookIdField.setText(
                            String.valueOf(book.getBookId())
                    )
            );

            card.add(imageLabel, BorderLayout.NORTH);
            card.add(nameLabel, BorderLayout.CENTER);
            card.add(selectButton, BorderLayout.SOUTH);

            cards.add(card);
        }

        return cards;
    }

    private void registerMember() {

        String input = memberIdField.getText().trim();

        if (input.isEmpty()) {
            memberMessage.setText("Please enter your Member ID.");
            return;
        }

        int memberId;

        try {
            memberId = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            memberMessage.setText("Member ID must contain digits only.");
            return;
        }

        if (memberId <= 0) {
            memberMessage.setText("Enter a valid positive Member ID.");
            return;
        }

        Member member = controller.registerMember(memberId);

        if (member == null) {
            memberMessage.setText("Member not found. Check your ID.");
            return;
        }

        currentMember = member;
        memberMessage.setText(" ");

        cardLayout.show(mainPanel, "borrow");
    }

    private void borrowBook() {

        if (currentMember == null) {
            resultLabel.setText("Please register first.");
            return;
        }

        String input = bookIdField.getText().trim();

        if (input.isEmpty()) {
            resultLabel.setForeground(Color.RED);
            resultLabel.setText("Please enter a Book ID.");
            return;
        }

        int bookId;

        try {
            bookId = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            resultLabel.setForeground(Color.RED);
            resultLabel.setText("Book ID must contain digits only.");
            return;
        }

        if (bookId <= 0) {
            resultLabel.setForeground(Color.RED);
            resultLabel.setText("Enter a valid positive Book ID.");
            return;
        }

        String result = controller.borrowBook(
                currentMember.getMemberId(),
                bookId
        );

        resultLabel.setForeground(
                result.toLowerCase().contains("successfully")
                        ? darkGreen
                        : Color.RED
        );

        resultLabel.setText(result);
    }

    private void styleButton(JButton button) {
        button.setBackground(darkGreen);
        button.setForeground(white);
        button.setFocusPainted(false);
        button.setFont(new Font("SansSerif", Font.BOLD, 15));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setPreferredSize(new Dimension(180, 38));
    }
}