package generated.data;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        java.lang.Class<?> wildcardClass1 = loanRecordRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "1) test02(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass4 = loanRecordRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "2) test03(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        model.LoanRecord loanRecord4 = null;
        // The following exception was thrown during execution in test generation
        try {
            loanRecordRepository0.saveLoanRecord(loanRecord4);
// flaky "1) test03(generated.data.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.LoanRecord.getMemberId()\" because \"loan\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "3) test04(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "4) test05(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        boolean boolean7 = false; // flaky "2) test05(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (byte) -1, 100, "hi!");
        model.LoanRecord loanRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            loanRecordRepository0.saveLoanRecord(loanRecord8);
// flaky "1) test05(generated.data.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.LoanRecord.getMemberId()\" because \"loan\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "5) test06(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        boolean boolean6 = false; // flaky "3) test06(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) '4', 1);
        java.lang.Class<?> wildcardClass7 = loanRecordRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        java.util.List<BorrowBook.Models.Book> bookList1 = bookRepository0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = bookRepository0.getAllBooks();
        java.lang.Class<?> wildcardClass3 = bookRepository0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "6) test08(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = loanRecordRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "7) test09(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        boolean boolean7 = false; // flaky "4) test09(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (byte) -1, 100, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = loanRecordRepository0.markLoanReturned((int) '4', (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Return date cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        java.util.List<BorrowBook.Models.Book> bookList1 = bookRepository0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = bookRepository0.getAllBooks();
        bookRepository0.updateBookStatus((int) '4');
        bookRepository0.updateBookStatus((int) (byte) 100);
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "8) test11(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        bookRepository0.updateBookStatus((int) 'a');
        boolean boolean8 = false; // flaky "5) test11(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "2) test11(generated.data.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus((int) ' ');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        java.lang.Class<?> wildcardClass1 = bookRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "9) test14(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        boolean boolean6 = false; // flaky "6) test14(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) '4', 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = loanRecordRepository0.markLoanReturned(100, 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Return date cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "10) test15(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        boolean boolean6 = false; // flaky "7) test15(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable((int) '#');
        java.util.List<BorrowBook.Models.Book> bookList7 = bookRepository0.getAllBooks();
        java.lang.Class<?> wildcardClass8 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "11) test16(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        bookRepository0.updateBookStatus((int) 'a');
        BorrowBook.Models.Book book8 = bookRepository0.getBookById(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        BorrowBook.Models.Book book2 = bookRepository0.getBookById((int) (short) -1);
        bookRepository0.updateBookStatus((int) (short) 1);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "12) test18(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 1, (int) '#');
        boolean boolean6 = false; // flaky "8) test18(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((-1), (int) (byte) 1);
        boolean boolean9 = false; // flaky "3) test18(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean4 = false; // flaky "13) test19(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (byte) 100, (int) (byte) 100, "hi!");
        model.LoanRecord loanRecord5 = null;
        // The following exception was thrown during execution in test generation
        try {
            loanRecordRepository0.saveLoanRecord(loanRecord5);
// flaky "9) test19(generated.data.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.LoanRecord.getMemberId()\" because \"loan\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        java.util.List<BorrowBook.Models.Book> bookList1 = bookRepository0.getAllBooks();
        BorrowBook.Models.Book book3 = bookRepository0.getBookById((int) (byte) 100);
        bookRepository0.updateBookStatus((int) '#');
        BorrowBook.Models.Book book7 = bookRepository0.getBookById((int) 'a');
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        BorrowBook.Models.Book book2 = bookRepository0.getBookById((int) (short) -1);
        boolean boolean4 = false; // flaky "14) test21(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        bookRepository0.updateBookStatus(100);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "15) test22(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 1, (int) '#');
        boolean boolean6 = false; // flaky "10) test22(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan(0, (int) (short) 10);
        model.LoanRecord loanRecord7 = null;
        // The following exception was thrown during execution in test generation
        try {
            loanRecordRepository0.saveLoanRecord(loanRecord7);
// flaky "4) test22(generated.data.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.LoanRecord.getMemberId()\" because \"loan\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "1) test22(generated.data.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "16) test23(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 1, (int) '#');
        boolean boolean6 = false; // flaky "11) test23(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((-1), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = loanRecordRepository0.markLoanReturned(1, (int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Return date cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "17) test24(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        java.util.List<BorrowBook.Models.Book> bookList5 = bookRepository0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        BorrowBook.DataLayer.MemberRepository memberRepository0 = new BorrowBook.DataLayer.MemberRepository();
        BorrowBook.Models.Member member2 = memberRepository0.getMemberById((int) (short) 10);
        java.util.List<BorrowBook.Models.Member> memberList3 = memberRepository0.getAllMembers();
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNotNull(memberList3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        java.lang.Class<?> wildcardClass3 = bookRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        java.util.List<BorrowBook.Models.Book> bookList1 = bookRepository0.getAllBooks();
        java.lang.Class<?> wildcardClass2 = bookRepository0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "18) test28(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 1, (int) '#');
        boolean boolean6 = false; // flaky "12) test28(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "19) test29(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 1, (int) '#');
        model.LoanRecord loanRecord4 = null;
        // The following exception was thrown during execution in test generation
        try {
            loanRecordRepository0.saveLoanRecord(loanRecord4);
// flaky "13) test29(generated.data.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.LoanRecord.getMemberId()\" because \"loan\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean4 = false; // flaky "20) test30(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean8 = false; // flaky "14) test30(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (byte) 10, 0, "hi!");
        boolean boolean11 = false; // flaky "5) test30(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan(10, (int) (short) 100);
        model.LoanRecord loanRecord12 = null;
        // The following exception was thrown during execution in test generation
        try {
            loanRecordRepository0.saveLoanRecord(loanRecord12);
// flaky "2) test30(generated.data.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.LoanRecord.getMemberId()\" because \"loan\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        BorrowBook.Models.Book book4 = bookRepository0.getBookById((int) '#');
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "21) test32(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 1, (int) '#');
        boolean boolean6 = false; // flaky "15) test32(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((-1), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = loanRecordRepository0.markLoanReturned((int) (byte) -1, (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Return date cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        BorrowBook.DataLayer.MemberRepository memberRepository0 = new BorrowBook.DataLayer.MemberRepository();
        BorrowBook.Models.Member member2 = memberRepository0.getMemberById((int) (short) 10);
        BorrowBook.Models.Member member4 = memberRepository0.getMemberById((int) (byte) 1);
        java.util.List<BorrowBook.Models.Member> memberList5 = memberRepository0.getAllMembers();
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNotNull(memberList5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "22) test34(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        boolean boolean7 = false; // flaky "16) test34(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) ' ', (int) (byte) -1, "hi!");
        boolean boolean10 = false; // flaky "6) test34(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = loanRecordRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        BorrowBook.DataLayer.MemberRepository memberRepository0 = new BorrowBook.DataLayer.MemberRepository();
        java.util.List<BorrowBook.Models.Member> memberList1 = memberRepository0.getAllMembers();
        java.util.List<BorrowBook.Models.Member> memberList2 = memberRepository0.getAllMembers();
        BorrowBook.Models.Member member4 = memberRepository0.getMemberById((int) (short) 10);
        org.junit.Assert.assertNotNull(memberList1);
        org.junit.Assert.assertNotNull(memberList2);
        org.junit.Assert.assertNull(member4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "23) test36(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        bookRepository0.updateBookStatus((int) 'a');
        BorrowBook.Models.Book book8 = bookRepository0.getBookById((int) (short) 0);
        BorrowBook.Models.Book book10 = bookRepository0.getBookById((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        java.util.List<BorrowBook.Models.Book> bookList1 = bookRepository0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = bookRepository0.getAllBooks();
        bookRepository0.updateBookStatus((int) (byte) 10);
        BorrowBook.Models.Book book6 = bookRepository0.getBookById((int) 'a');
        BorrowBook.Models.Book book8 = bookRepository0.getBookById((int) (short) -1);
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        BorrowBook.DataLayer.MemberRepository memberRepository0 = new BorrowBook.DataLayer.MemberRepository();
        java.util.List<BorrowBook.Models.Member> memberList1 = memberRepository0.getAllMembers();
        BorrowBook.Models.Member member3 = memberRepository0.getMemberById((int) (short) 100);
        org.junit.Assert.assertNotNull(memberList1);
        org.junit.Assert.assertNull(member3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean4 = false; // flaky "24) test39(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean8 = false; // flaky "17) test39(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (byte) 10, 0, "hi!");
        boolean boolean12 = false; // flaky "7) test39(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (short) -1, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "25) test40(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        boolean boolean6 = false; // flaky "18) test40(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "26) test41(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        boolean boolean6 = false; // flaky "19) test41(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable((int) '#');
        boolean boolean8 = false; // flaky "8) test41(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean4 = false; // flaky "27) test42(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean7 = false; // flaky "20) test42(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan(1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "28) test43(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        boolean boolean7 = false; // flaky "21) test43(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) ' ', (int) (byte) -1, "hi!");
        model.LoanRecord loanRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            loanRecordRepository0.saveLoanRecord(loanRecord8);
// flaky "9) test43(generated.data.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.LoanRecord.getMemberId()\" because \"loan\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "29) test44(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        boolean boolean6 = false; // flaky "22) test44(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable((int) '#');
        bookRepository0.updateBookStatus((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        BorrowBook.DataLayer.MemberRepository memberRepository0 = new BorrowBook.DataLayer.MemberRepository();
        java.util.List<BorrowBook.Models.Member> memberList1 = memberRepository0.getAllMembers();
        BorrowBook.Models.Member member3 = memberRepository0.getMemberById(1);
        java.util.List<BorrowBook.Models.Member> memberList4 = memberRepository0.getAllMembers();
        BorrowBook.Models.Member member6 = memberRepository0.getMemberById((int) (byte) -1);
        org.junit.Assert.assertNotNull(memberList1);
        org.junit.Assert.assertNull(member3);
        org.junit.Assert.assertNotNull(memberList4);
        org.junit.Assert.assertNull(member6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        java.util.List<BorrowBook.Models.Book> bookList1 = bookRepository0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = bookRepository0.getAllBooks();
        bookRepository0.updateBookStatus((int) (byte) 10);
        BorrowBook.Models.Book book6 = bookRepository0.getBookById((int) 'a');
        BorrowBook.Models.Book book8 = bookRepository0.getBookById((int) 'a');
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "30) test47(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        boolean boolean6 = false; // flaky "23) test47(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) '4', 1);
        boolean boolean9 = false; // flaky "10) test47(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "31) test48(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        bookRepository0.updateBookStatus((int) 'a');
        java.util.List<BorrowBook.Models.Book> bookList7 = bookRepository0.getAllBooks();
        boolean boolean9 = false; // flaky "24) test48(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable((int) ' ');
        java.util.List<BorrowBook.Models.Book> bookList10 = bookRepository0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList11 = bookRepository0.getAllBooks();
        bookRepository0.updateBookStatus((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        boolean boolean2 = false; // flaky "32) test49(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable((int) (short) 0);
        java.util.List<BorrowBook.Models.Book> bookList3 = bookRepository0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookList3);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "33) test50(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        boolean boolean7 = false; // flaky "25) test50(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (byte) -1, 100, "hi!");
        boolean boolean10 = false; // flaky "11) test50(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "3) test50(generated.data.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "34) test51(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        bookRepository0.updateBookStatus((int) 'a');
        java.util.List<BorrowBook.Models.Book> bookList7 = bookRepository0.getAllBooks();
        boolean boolean9 = false; // flaky "26) test51(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable((int) ' ');
        java.util.List<BorrowBook.Models.Book> bookList10 = bookRepository0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList11 = bookRepository0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList12 = bookRepository0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        BorrowBook.DataLayer.MemberRepository memberRepository0 = new BorrowBook.DataLayer.MemberRepository();
        BorrowBook.Models.Member member2 = memberRepository0.getMemberById((int) (short) 10);
        BorrowBook.Models.Member member4 = memberRepository0.getMemberById((int) (byte) 1);
        BorrowBook.Models.Member member6 = memberRepository0.getMemberById(0);
        java.util.List<BorrowBook.Models.Member> memberList7 = memberRepository0.getAllMembers();
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNotNull(memberList7);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "35) test53(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, (int) '4');
        boolean boolean6 = false; // flaky "27) test53(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) '4', 1);
        boolean boolean10 = false; // flaky "12) test53(generated.data.RegressionTest0)": loanRecordRepository0.markLoanReturned((int) (short) 100, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "36) test54(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 1, (int) '#');
        boolean boolean6 = false; // flaky "28) test54(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) 'a', (int) (short) 1);
        model.LoanRecord loanRecord7 = null;
        // The following exception was thrown during execution in test generation
        try {
            loanRecordRepository0.saveLoanRecord(loanRecord7);
// flaky "13) test54(generated.data.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.LoanRecord.getMemberId()\" because \"loan\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        BorrowBook.DataLayer.MemberRepository memberRepository0 = new BorrowBook.DataLayer.MemberRepository();
        java.util.List<BorrowBook.Models.Member> memberList1 = memberRepository0.getAllMembers();
        java.util.List<BorrowBook.Models.Member> memberList2 = memberRepository0.getAllMembers();
        java.util.List<BorrowBook.Models.Member> memberList3 = memberRepository0.getAllMembers();
        org.junit.Assert.assertNotNull(memberList1);
        org.junit.Assert.assertNotNull(memberList2);
        org.junit.Assert.assertNotNull(memberList3);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        bookRepository0.updateBookStatus(0);
        boolean boolean4 = false; // flaky "37) test56(generated.data.RegressionTest0)": bookRepository0.updateBookAsAvailable(0);
        bookRepository0.updateBookStatus((int) 'a');
        BorrowBook.Models.Book book8 = bookRepository0.getBookById((int) (short) 0);
        BorrowBook.Models.Book book10 = bookRepository0.getBookById((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(book8);
// flaky "29) test56(generated.data.RegressionTest0)":         org.junit.Assert.assertNotNull(book10);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        BorrowBook.DataLayer.BookRepository bookRepository0 = new BorrowBook.DataLayer.BookRepository();
        java.util.List<BorrowBook.Models.Book> bookList1 = bookRepository0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = bookRepository0.getAllBooks();
        bookRepository0.updateBookStatus((int) '4');
        BorrowBook.Models.Book book6 = bookRepository0.getBookById(10);
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
// flaky "38) test57(generated.data.RegressionTest0)":         org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        BorrowBook.DataLayer.LoanRecordRepository loanRecordRepository0 = new BorrowBook.DataLayer.LoanRecordRepository();
        boolean boolean3 = false; // flaky "39) test58(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 1, (int) '#');
        boolean boolean6 = false; // flaky "30) test58(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) 'a', (int) (short) 1);
        boolean boolean9 = false; // flaky "14) test58(generated.data.RegressionTest0)": loanRecordRepository0.findActiveLoan((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}
