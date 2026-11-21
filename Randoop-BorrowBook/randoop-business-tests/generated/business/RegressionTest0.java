package generated.business;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        BorrowBook.BusinessLayer.BorrowValidator borrowValidator0 = new BorrowBook.BusinessLayer.BorrowValidator();
        BorrowBook.Models.Book book1 = null;
        boolean boolean2 = borrowValidator0.isBookAvailable(book1);
        java.lang.Class<?> wildcardClass3 = borrowValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.lang.Class<?> wildcardClass2 = bookList1.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.lang.Class<?> wildcardClass2 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 10);
        org.junit.Assert.assertNull(member2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        BorrowBook.BusinessLayer.BorrowValidator borrowValidator0 = new BorrowBook.BusinessLayer.BorrowValidator();
        java.lang.Class<?> wildcardClass1 = borrowValidator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((-1));
        BorrowBook.Models.Member member6 = memberService0.findMember(10);
        BorrowBook.Models.Member member8 = memberService0.findMember(0);
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((int) (short) 100);
        BorrowBook.Models.Member member6 = memberService0.findMember((int) (byte) 100);
        BorrowBook.Models.Member member8 = memberService0.findMember((int) (short) -1);
        BorrowBook.Models.Member member10 = memberService0.findMember((int) 'a');
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        BorrowBook.BusinessLayer.BorrowValidator borrowValidator0 = new BorrowBook.BusinessLayer.BorrowValidator();
        BorrowBook.Models.Book book1 = null;
        boolean boolean2 = borrowValidator0.isBookAvailable(book1);
        BorrowBook.Models.Book book3 = null;
        boolean boolean4 = borrowValidator0.isBookAvailable(book3);
        BorrowBook.Models.Book book5 = null;
        boolean boolean6 = borrowValidator0.isBookAvailable(book5);
        java.lang.Class<?> wildcardClass7 = borrowValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.lang.Class<?> wildcardClass3 = bookList2.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.lang.String str5 = borrowService0.borrowBook((int) '4', (int) (byte) 100);
        java.lang.String str8 = borrowService0.borrowBook((int) (byte) 100, (int) (short) 100);
        java.util.List<BorrowBook.Models.Book> bookList9 = borrowService0.getAllBooks();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "book is not available." + "'", str5, "book is not available.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "book is not available." + "'", str8, "book is not available.");
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((int) (short) 100);
        BorrowBook.Models.Member member6 = memberService0.findMember((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = memberService0.getClass();
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook((int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass4 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        BorrowBook.BusinessLayer.BorrowValidator borrowValidator0 = new BorrowBook.BusinessLayer.BorrowValidator();
        BorrowBook.Models.Book book1 = null;
        boolean boolean2 = borrowValidator0.isBookAvailable(book1);
        BorrowBook.Models.Book book3 = null;
        boolean boolean4 = borrowValidator0.isBookAvailable(book3);
        BorrowBook.Models.Book book5 = null;
        boolean boolean6 = borrowValidator0.isBookAvailable(book5);
        BorrowBook.Models.Book book7 = null;
        boolean boolean8 = borrowValidator0.isBookAvailable(book7);
        BorrowBook.Models.Book book9 = null;
        boolean boolean10 = borrowValidator0.isBookAvailable(book9);
        BorrowBook.Models.Book book11 = null;
        boolean boolean12 = borrowValidator0.isBookAvailable(book11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook((int) 'a', (int) 'a');
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowService0.getAllBooks();
        java.lang.String str7 = borrowService0.borrowBook((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "book is not available." + "'", str7, "book is not available.");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        BorrowBook.BusinessLayer.BorrowValidator borrowValidator0 = new BorrowBook.BusinessLayer.BorrowValidator();
        BorrowBook.Models.Book book1 = null;
        boolean boolean2 = borrowValidator0.isBookAvailable(book1);
        BorrowBook.Models.Book book3 = null;
        boolean boolean4 = borrowValidator0.isBookAvailable(book3);
        BorrowBook.Models.Book book5 = null;
        boolean boolean6 = borrowValidator0.isBookAvailable(book5);
        BorrowBook.Models.Book book7 = null;
        boolean boolean8 = borrowValidator0.isBookAvailable(book7);
        BorrowBook.Models.Book book9 = null;
        boolean boolean10 = borrowValidator0.isBookAvailable(book9);
        java.lang.Class<?> wildcardClass11 = borrowValidator0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.lang.String str5 = borrowService0.borrowBook(0, (int) (short) 10);
        java.util.List<BorrowBook.Models.Book> bookList6 = borrowService0.getAllBooks();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "book is not available." + "'", str5, "book is not available.");
        org.junit.Assert.assertNotNull(bookList6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = member2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(member2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((-1));
        BorrowBook.Models.Member member6 = memberService0.findMember(10);
        BorrowBook.Models.Member member8 = memberService0.findMember((int) '4');
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((int) (short) 100);
        BorrowBook.Models.Member member6 = memberService0.findMember(100);
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook(1, (int) (short) -1);
        java.lang.String str6 = borrowService0.borrowBook((int) (short) 1, 0);
        java.lang.String str9 = borrowService0.borrowBook((int) '4', (int) (short) -1);
        java.lang.String str12 = borrowService0.borrowBook((int) (short) -1, (int) (byte) 10);
        java.lang.String str15 = borrowService0.borrowBook((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "book is not available." + "'", str12, "book is not available.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "book is not available." + "'", str15, "book is not available.");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((int) (short) 100);
        BorrowBook.Models.Member member6 = memberService0.findMember((int) '#');
        BorrowBook.Models.Member member8 = memberService0.findMember((int) '#');
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook(1, (int) (short) -1);
        java.lang.String str6 = borrowService0.borrowBook(0, (int) ' ');
        java.lang.String str9 = borrowService0.borrowBook(0, 0);
        java.lang.String str12 = borrowService0.borrowBook((int) ' ', (int) 'a');
        java.lang.String str15 = borrowService0.borrowBook((int) ' ', (int) (byte) -1);
        java.lang.String str18 = borrowService0.borrowBook(100, 1);
        java.util.List<BorrowBook.Models.Book> bookList19 = borrowService0.getAllBooks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "book is not available." + "'", str12, "book is not available.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "book is not available." + "'", str15, "book is not available.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "book is not available." + "'", str18, "book is not available.");
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((-1));
        BorrowBook.Models.Member member6 = memberService0.findMember((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = member6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook(1, (int) (short) -1);
        java.lang.String str6 = borrowService0.borrowBook(0, (int) ' ');
        java.util.List<BorrowBook.Models.Book> bookList7 = borrowService0.getAllBooks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook((int) (short) 100, 0);
        java.lang.String str6 = borrowService0.borrowBook(0, (int) (byte) -1);
        java.lang.String str9 = borrowService0.borrowBook(1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList3 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList5 = borrowService0.getAllBooks();
        java.lang.Class<?> wildcardClass6 = bookList5.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook(1, (int) (short) -1);
        java.lang.String str6 = borrowService0.borrowBook((int) (short) 1, 0);
        java.lang.String str9 = borrowService0.borrowBook((int) (byte) 100, (int) (byte) 100);
        java.util.List<BorrowBook.Models.Book> bookList10 = borrowService0.getAllBooks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook((int) (short) 100, 0);
        java.lang.String str6 = borrowService0.borrowBook(0, (int) (byte) -1);
        java.lang.String str9 = borrowService0.borrowBook((int) (short) -1, 100);
        java.lang.String str12 = borrowService0.borrowBook(0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "book is not available." + "'", str12, "book is not available.");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((-1));
        BorrowBook.Models.Member member6 = memberService0.findMember((int) (byte) -1);
        BorrowBook.Models.Member member8 = memberService0.findMember((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = memberService0.getClass();
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList3 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList5 = borrowService0.getAllBooks();
        java.lang.String str8 = borrowService0.borrowBook((int) (short) 0, 0);
        java.lang.String str11 = borrowService0.borrowBook(0, (int) (byte) 100);
        java.util.List<BorrowBook.Models.Book> bookList12 = borrowService0.getAllBooks();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "book is not available." + "'", str8, "book is not available.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "book is not available." + "'", str11, "book is not available.");
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook(1, (int) (short) -1);
        java.lang.String str6 = borrowService0.borrowBook((int) (short) 1, 0);
        java.lang.String str9 = borrowService0.borrowBook((int) '4', (int) (short) -1);
        java.lang.String str12 = borrowService0.borrowBook((int) (short) -1, (int) (byte) 10);
        java.util.List<BorrowBook.Models.Book> bookList13 = borrowService0.getAllBooks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "book is not available." + "'", str12, "book is not available.");
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook((int) 'a', (int) 'a');
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowService0.getAllBooks();
        java.lang.String str7 = borrowService0.borrowBook((int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "book is not available." + "'", str7, "book is not available.");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((int) (short) 100);
        BorrowBook.Models.Member member6 = memberService0.findMember((int) '#');
        BorrowBook.Models.Member member8 = memberService0.findMember((int) ' ');
        java.lang.Class<?> wildcardClass9 = memberService0.getClass();
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook((int) 'a', (int) 'a');
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowService0.getAllBooks();
        java.lang.String str7 = borrowService0.borrowBook((int) (short) 0, (int) (short) 10);
        java.util.List<BorrowBook.Models.Book> bookList8 = borrowService0.getAllBooks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "book is not available." + "'", str7, "book is not available.");
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.lang.String str5 = borrowService0.borrowBook((int) '4', (int) (short) 0);
        java.util.List<BorrowBook.Models.Book> bookList6 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList7 = borrowService0.getAllBooks();
        java.lang.Class<?> wildcardClass8 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "book is not available." + "'", str5, "book is not available.");
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((int) (short) 100);
        BorrowBook.Models.Member member6 = memberService0.findMember((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = member6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((-1));
        BorrowBook.Models.Member member6 = memberService0.findMember((int) (byte) -1);
        BorrowBook.Models.Member member8 = memberService0.findMember((int) ' ');
        BorrowBook.Models.Member member10 = memberService0.findMember(10);
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
        org.junit.Assert.assertNull(member10);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.lang.String str5 = borrowService0.borrowBook((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "book is not available." + "'", str5, "book is not available.");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.lang.String str5 = borrowService0.borrowBook((int) '4', (int) (short) 0);
        java.util.List<BorrowBook.Models.Book> bookList6 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList7 = borrowService0.getAllBooks();
        java.lang.Class<?> wildcardClass8 = bookList7.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "book is not available." + "'", str5, "book is not available.");
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook((int) 'a', (int) 'a');
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowService0.getAllBooks();
        java.lang.String str7 = borrowService0.borrowBook((int) '4', (int) '#');
        java.util.List<BorrowBook.Models.Book> bookList8 = borrowService0.getAllBooks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "book is not available." + "'", str7, "book is not available.");
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.lang.String str5 = borrowService0.borrowBook((int) '4', (int) (byte) 100);
        java.lang.String str8 = borrowService0.borrowBook((int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "book is not available." + "'", str5, "book is not available.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "book is not available." + "'", str8, "book is not available.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList3 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList5 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList6 = borrowService0.getAllBooks();
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList3 = borrowService0.getAllBooks();
        java.lang.String str6 = borrowService0.borrowBook(1, (int) ' ');
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "book is not available." + "'", str6, "book is not available.");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.util.List<BorrowBook.Models.Book> bookList1 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList2 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList3 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList5 = borrowService0.getAllBooks();
        java.util.List<BorrowBook.Models.Book> bookList6 = borrowService0.getAllBooks();
        java.lang.String str9 = borrowService0.borrowBook((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "book is not available." + "'", str9, "book is not available.");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        BorrowBook.BusinessLayer.BorrowService borrowService0 = new BorrowBook.BusinessLayer.BorrowService();
        java.lang.String str3 = borrowService0.borrowBook((int) 'a', (int) 'a');
        java.util.List<BorrowBook.Models.Book> bookList4 = borrowService0.getAllBooks();
        java.lang.String str7 = borrowService0.borrowBook((int) (short) 0, (int) (short) 10);
        java.lang.String str10 = borrowService0.borrowBook(100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "book is not available." + "'", str3, "book is not available.");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "book is not available." + "'", str7, "book is not available.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "book is not available." + "'", str10, "book is not available.");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        BorrowBook.BusinessLayer.MemberService memberService0 = new BorrowBook.BusinessLayer.MemberService();
        BorrowBook.Models.Member member2 = memberService0.findMember((int) (short) 0);
        BorrowBook.Models.Member member4 = memberService0.findMember((-1));
        BorrowBook.Models.Member member6 = memberService0.findMember((int) (byte) -1);
        BorrowBook.Models.Member member8 = memberService0.findMember(10);
        org.junit.Assert.assertNull(member2);
        org.junit.Assert.assertNull(member4);
        org.junit.Assert.assertNull(member6);
        org.junit.Assert.assertNull(member8);
    }
}

