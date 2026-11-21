import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList36 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList38 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList40 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList42 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
        org.junit.Assert.assertNotNull(bookList40);
        org.junit.Assert.assertNotNull(bookList42);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass21 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass29 = bookList28.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass35 = bookList34.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass27 = bookList26.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass21 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass27 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass25 = bookList24.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass21 = bookList20.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass27 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass31 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass23 = bookList22.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList36 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList38 = bookData0.searchBooks("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass31 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList42 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass43 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
        org.junit.Assert.assertNotNull(bookList40);
        org.junit.Assert.assertNotNull(bookList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass13 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList34 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList42 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass43 = bookList42.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
        org.junit.Assert.assertNotNull(bookList40);
        org.junit.Assert.assertNotNull(bookList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass23 = bookList22.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass19 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass37 = bookList36.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass21 = bookList20.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass29 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList42 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList44 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
        org.junit.Assert.assertNotNull(bookList40);
        org.junit.Assert.assertNotNull(bookList42);
        org.junit.Assert.assertNotNull(bookList44);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass27 = bookList26.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass35 = bookList34.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass35 = bookList34.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass27 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList36 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList38 = bookData0.searchBooks("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList32 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList36 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass19 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass29 = bookList28.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass41 = bookList40.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
        org.junit.Assert.assertNotNull(bookList40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList42 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList44 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList46 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList48 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList50 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
        org.junit.Assert.assertNotNull(bookList40);
        org.junit.Assert.assertNotNull(bookList42);
        org.junit.Assert.assertNotNull(bookList44);
        org.junit.Assert.assertNotNull(bookList46);
        org.junit.Assert.assertNotNull(bookList48);
        org.junit.Assert.assertNotNull(bookList50);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass27 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass27 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass21 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass27 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass25 = bookList24.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = bookList24.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass31 = bookList30.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList42 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList44 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList46 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
        org.junit.Assert.assertNotNull(bookList40);
        org.junit.Assert.assertNotNull(bookList42);
        org.junit.Assert.assertNotNull(bookList44);
        org.junit.Assert.assertNotNull(bookList46);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass19 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass23 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass37 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass19 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass23 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass23 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList32 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList34 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList36 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList38 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass39 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
        org.junit.Assert.assertNotNull(bookList38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass25 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass27 = bookList26.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass15 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = bookList24.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("hi!");
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNotNull(bookList32);
        org.junit.Assert.assertNotNull(bookList34);
        org.junit.Assert.assertNotNull(bookList36);
    }
}

