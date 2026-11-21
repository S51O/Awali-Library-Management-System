package generated.presentation;

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
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.Class<?> wildcardClass1 = borrowController0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = borrowController0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.Class<?> wildcardClass2 = bookList1.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = borrowController0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) 'a');
        java.util.List<BorrowBook.Models.Book> bookList7 = borrowController0.getAllBooks();
        java.lang.Class<?> wildcardClass8 = borrowController0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember(100);
        java.lang.Class<?> wildcardClass7 = borrowController0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = borrowController0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        java.lang.String str7 = borrowController0.borrowBook((int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "book is not available." + "'", str7, "book is not available.");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass7 = borrowController0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        java.util.List<BorrowBook.Models.Book> bookList5 = borrowController0.getAllBooks();
        java.lang.Class<?> wildcardClass6 = borrowController0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember(100);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList9 = borrowController0.getAllBooks();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = member10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        java.lang.Class<?> wildcardClass5 = bookList4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = borrowController0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        java.util.List<BorrowBook.Models.Book> bookList9 = borrowController0.getAllBooks();
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember(100);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) (byte) 1);
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 100);
        java.lang.String str13 = borrowController0.borrowBook((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "book is not available." + "'", str13, "book is not available.");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        java.util.List<BorrowBook.Models.Book> bookList9 = borrowController0.getAllBooks();
        java.lang.String str12 = borrowController0.borrowBook((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "book is not available." + "'", str12, "book is not available.");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (short) 10);
        BorrowBook.Models.Member member8 = borrowController0.registerMember(10);
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 100);
        BorrowBook.Models.Member member12 = borrowController0.registerMember((int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertNull(member12);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (short) 10);
        BorrowBook.Models.Member member8 = borrowController0.registerMember(10);
        java.lang.String str11 = borrowController0.borrowBook((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "book is not available." + "'", str11, "book is not available.");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = member6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(member6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        BorrowBook.Models.Member member5 = borrowController0.registerMember((int) (short) -1);
        java.lang.String str8 = borrowController0.borrowBook(0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNull(member5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "book is not available." + "'", str8, "book is not available.");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList5 = borrowController0.getAllBooks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 0);
        java.lang.String str13 = borrowController0.borrowBook((int) ' ', (int) (byte) -1);
        java.lang.String str16 = borrowController0.borrowBook((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "book is not available." + "'", str13, "book is not available.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "book is not available." + "'", str16, "book is not available.");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 0);
        java.util.List<BorrowBook.Models.Book> bookList11 = borrowController0.getAllBooks();
        java.lang.String str14 = borrowController0.borrowBook(0, (int) (short) -1);
        BorrowBook.Models.Member member16 = borrowController0.registerMember((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = borrowController0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "book is not available." + "'", str14, "book is not available.");
        org.junit.Assert.assertNull(member16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 0);
        java.util.List<BorrowBook.Models.Book> bookList11 = borrowController0.getAllBooks();
        java.lang.String str14 = borrowController0.borrowBook(0, (int) (short) -1);
        java.lang.String str17 = borrowController0.borrowBook(0, (int) ' ');
        java.lang.Class<?> wildcardClass18 = borrowController0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "book is not available." + "'", str14, "book is not available.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "book is not available." + "'", str17, "book is not available.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.Class<?> wildcardClass2 = borrowController0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (byte) -1);
        BorrowBook.Models.Member member8 = borrowController0.registerMember(0);
        java.lang.String str11 = borrowController0.borrowBook((int) (short) 1, 0);
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "book is not available." + "'", str11, "book is not available.");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        java.util.List<BorrowBook.Models.Book> bookList9 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member11 = borrowController0.registerMember((int) (short) 0);
        java.lang.String str14 = borrowController0.borrowBook((int) (short) 100, (int) (short) 1);
        java.lang.String str17 = borrowController0.borrowBook((int) '#', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(member11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "book is not available." + "'", str14, "book is not available.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "book is not available." + "'", str17, "book is not available.");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 0);
        java.lang.String str13 = borrowController0.borrowBook(1, (int) (byte) 100);
        BorrowBook.Models.Member member15 = borrowController0.registerMember((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "book is not available." + "'", str13, "book is not available.");
        org.junit.Assert.assertNull(member15);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 0);
        java.util.List<BorrowBook.Models.Book> bookList11 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member13 = borrowController0.registerMember(100);
        java.lang.String str16 = borrowController0.borrowBook((-1), 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(member13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "book is not available." + "'", str16, "book is not available.");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (short) 10);
        BorrowBook.Models.Member member8 = borrowController0.registerMember(10);
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = borrowController0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember(100);
        java.lang.String str9 = borrowController0.borrowBook((int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass10 = borrowController0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        java.util.List<BorrowBook.Models.Book> bookList5 = borrowController0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList6 = borrowController0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList7 = borrowController0.getAllBooks();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 0);
        java.util.List<BorrowBook.Models.Book> bookList11 = borrowController0.getAllBooks();
        java.lang.String str14 = borrowController0.borrowBook(0, (int) (short) -1);
        java.lang.String str17 = borrowController0.borrowBook((int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "book is not available." + "'", str14, "book is not available.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "book is not available." + "'", str17, "book is not available.");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember(100);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) (byte) 1);
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = member10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (short) -1);
        java.lang.String str9 = borrowController0.borrowBook((int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        BorrowBook.Models.Member member2 = borrowController0.registerMember((int) (byte) -1);
        BorrowBook.Models.Member member4 = borrowController0.registerMember((int) (byte) -1);
        java.util.List<BorrowBook.Models.Book> bookList5 = borrowController0.getAllBooks();
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        java.lang.String str7 = borrowController0.borrowBook((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "book is not available." + "'", str7, "book is not available.");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        BorrowBook.Models.Member member2 = borrowController0.registerMember((int) (byte) -1);
        java.lang.String str5 = borrowController0.borrowBook((int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = borrowController0.getClass();
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "book is not available." + "'", str5, "book is not available.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        java.lang.String str9 = borrowController0.borrowBook(0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 0);
        java.util.List<BorrowBook.Models.Book> bookList11 = borrowController0.getAllBooks();
        java.lang.Class<?> wildcardClass12 = borrowController0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) 'a');
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) ' ');
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        java.util.List<BorrowBook.Models.Book> bookList7 = borrowController0.getAllBooks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        java.util.List<BorrowBook.Models.Book> bookList9 = borrowController0.getAllBooks();
        java.lang.String str12 = borrowController0.borrowBook((int) 'a', (int) '#');
        BorrowBook.Models.Member member14 = borrowController0.registerMember(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "book is not available." + "'", str12, "book is not available.");
        org.junit.Assert.assertNull(member14);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        BorrowBook.Models.Member member2 = borrowController0.registerMember((int) (byte) -1);
        java.util.List<BorrowBook.Models.Book> bookList3 = borrowController0.getAllBooks();
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) ' ');
        java.util.List<BorrowBook.Models.Book> bookList7 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member9 = borrowController0.registerMember((int) 'a');
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(member9);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (byte) -1);
        java.lang.String str9 = borrowController0.borrowBook((-1), 10);
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) 'a');
        java.util.List<BorrowBook.Models.Book> bookList7 = borrowController0.getAllBooks();
        java.lang.String str10 = borrowController0.borrowBook((int) ' ', (int) (short) -1);
        java.lang.String str13 = borrowController0.borrowBook((int) (byte) -1, 10);
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "book is not available." + "'", str10, "book is not available.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "book is not available." + "'", str13, "book is not available.");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) 'a', (int) '4');
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) ' ');
        java.lang.String str11 = borrowController0.borrowBook((int) (byte) 1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "book is not available." + "'", str11, "book is not available.");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (byte) -1);
        BorrowBook.Models.Member member8 = borrowController0.registerMember(0);
        java.util.List<BorrowBook.Models.Book> bookList9 = borrowController0.getAllBooks();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        java.util.List<BorrowBook.Models.Book> bookList9 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member11 = borrowController0.registerMember(10);
        java.util.List<BorrowBook.Models.Book> bookList12 = borrowController0.getAllBooks();
        java.lang.Class<?> wildcardClass13 = borrowController0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(member11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        java.util.List<BorrowBook.Models.Book> bookList9 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member11 = borrowController0.registerMember(10);
        java.util.List<BorrowBook.Models.Book> bookList12 = borrowController0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList13 = borrowController0.getAllBooks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(member11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str6 = borrowController0.borrowBook((int) (byte) 10, (int) (short) 0);
        BorrowBook.Models.Member member8 = borrowController0.registerMember((int) '#');
        java.util.List<BorrowBook.Models.Book> bookList9 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member11 = borrowController0.registerMember((int) (short) 0);
        java.util.List<BorrowBook.Models.Book> bookList12 = borrowController0.getAllBooks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(member11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowController0.getAllBooks();
        java.lang.String str4 = borrowController0.borrowBook(1, 1);
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = borrowController0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "book is not available." + "'", str4, "book is not available.");
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        BorrowBook.PresentationLayer.BorrowController borrowController0 = new BorrowBook.PresentationLayer.BorrowController();
        java.lang.String str3 = borrowController0.borrowBook((int) (short) -1, (int) (byte) 1);
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowController0.getAllBooks();
        BorrowBook.Models.Member member6 = borrowController0.registerMember((int) (short) 10);
        BorrowBook.Models.Member member8 = borrowController0.registerMember(10);
        BorrowBook.Models.Member member10 = borrowController0.registerMember((int) (byte) 100);
        BorrowBook.Models.Member member12 = borrowController0.registerMember((int) (short) 0);
        java.lang.String str15 = borrowController0.borrowBook(1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
        org.junit.Assert.assertNull(member12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "book is not available." + "'", str15, "book is not available.");
    }
}

