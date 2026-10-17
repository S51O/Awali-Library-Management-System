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
    private JLabel memberNameLabel;

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

        JPanel panel = new JPanel(new BorderLayout(15, 15));
        panel.setBackground(lightGreen);
        panel.setBorder(new EmptyBorder(30, 35, 30, 35));

        JLabel title = new JLabel(
                "Welcome to Awali Library",
                SwingConstants.CENTER
        );
        title.setFont(new Font("SansSerif", Font.BOLD, 24));
        title.setForeground(darkGreen);

        memberNameLabel = new JLabel("", SwingConstants.CENTER);
        memberNameLabel.setFont(
                new Font("SansSerif", Font.PLAIN, 15)
        );

        JPanel heading = new JPanel(new GridLayout(2, 1, 8, 8));
        heading.setOpaque(false);
        heading.add(title);
        heading.add(memberNameLabel);

        JPanel form = new JPanel(new GridBagLayout());
        form.setBackground(white);
        form.setBorder(new EmptyBorder(25, 20, 25, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 8, 10, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;

        JLabel bookLabel = new JLabel("Book ID:");
        bookLabel.setFont(new Font("SansSerif", Font.BOLD, 15));

        bookIdField = new JTextField(15);
        bookIdField.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JButton borrowButton = new JButton("Borrow Book");
        styleButton(borrowButton);

        resultLabel = new JLabel(" ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

        JButton backButton = new JButton("Back");
        styleButton(backButton);

        gbc.gridx = 0;
        gbc.gridy = 0;
        form.add(bookLabel, gbc);

        gbc.gridy = 1;
        form.add(bookIdField, gbc);

        gbc.gridy = 2;
        form.add(borrowButton, gbc);

        gbc.gridy = 3;
        form.add(resultLabel, gbc);

        gbc.gridy = 4;
        form.add(backButton, gbc);

        borrowButton.addActionListener(e -> borrowBook());
        bookIdField.addActionListener(e -> borrowBook());

        backButton.addActionListener(e -> {
            currentMember = null;
            memberIdField.setText("");
            memberMessage.setText(" ");
            bookIdField.setText("");
            resultLabel.setText(" ");
            cardLayout.show(mainPanel, "registration");
        });

        panel.add(heading, BorderLayout.NORTH);
        panel.add(form, BorderLayout.CENTER);

        return panel;
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
            memberMessage.setText(
                    "Member ID must contain digits only."
            );
            return;
        }

        if (memberId <= 0) {
            memberMessage.setText(
                    "Enter a valid positive Member ID."
            );
            return;
        }

        Member member = controller.registerMember(memberId);

        if (member == null) {
            memberMessage.setText(
                    "Member not found. Check your ID."
            );
            return;
        }

        currentMember = member;

        memberNameLabel.setText(
                "Welcome, " + currentMember.getName()
                        + " (Member ID: "
                        + currentMember.getMemberId() + ")"
        );

        memberMessage.setText(" ");
        bookIdField.setText("");
        resultLabel.setText(" ");

        cardLayout.show(mainPanel, "borrow");
    }

    private void borrowBook() {

        if (currentMember == null) {
            resultLabel.setForeground(Color.RED);
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
            resultLabel.setText(
                    "Book ID must contain digits only."
            );
            return;
        }

        if (bookId <= 0) {
            resultLabel.setForeground(Color.RED);
            resultLabel.setText(
                    "Enter a valid positive Book ID."
            );
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