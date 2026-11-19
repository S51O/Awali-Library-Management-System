import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass13 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass11 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass13 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass9 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass33 = bookList32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass13 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass15 = searchBookService0.getClass();
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass15 = searchBookService0.getClass();
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass9 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass29 = searchBookService0.getClass();
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
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
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass11 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = searchBookService0.getClass();
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList32 = bookData0.searchBooks("");
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass15 = searchBookService0.getClass();
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass29 = searchBookService0.getClass();
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass33 = searchBookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass11 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
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
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass13 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
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
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
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
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        java.lang.Class<?> wildcardClass33 = searchBookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass33 = searchBookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("hi!");
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass13 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass13 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("hi!");
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass11 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
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
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
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
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass13 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass11 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
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
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass13 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        java.lang.Class<?> wildcardClass33 = bookList32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass41 = searchBookService0.getClass();
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("");
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        java.lang.Class<?> wildcardClass39 = searchBookService0.getClass();
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
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
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass33 = searchBookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        java.lang.Class<?> wildcardClass35 = bookData0.getClass();
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
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
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass29 = searchBookService0.getClass();
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass33 = bookList32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("");
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
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass29 = searchBookService0.getClass();
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
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
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        java.lang.Class<?> wildcardClass39 = searchBookService0.getClass();
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
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList42 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList44 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList46 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass47 = bookList46.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList30 = bookData0.searchBooks("hi!");
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass29 = searchBookService0.getClass();
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
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
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass29 = searchBookService0.getClass();
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList42 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList44 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList46 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList48 = searchBookService0.searchBook("");
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
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.Class<?> wildcardClass39 = bookList38.getClass();
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
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
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
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass33 = searchBookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
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
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass29 = searchBookService0.getClass();
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
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
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass15 = searchBookService0.getClass();
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
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
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = searchBookService0.getClass();
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        java.util.List<SearchBook.Data.Book> bookList36 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass39 = searchBookService0.getClass();
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("hi!");
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
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
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.util.List<SearchBook.Data.Book> bookList26 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = bookData0.searchBooks("");
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
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        java.lang.Class<?> wildcardClass21 = searchBookService0.getClass();
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass17 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList24 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        java.util.List<SearchBook.Data.Book> bookList22 = searchBookService0.searchBook("");
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass5 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        java.util.List<SearchBook.Data.Book> bookList38 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList40 = searchBookService0.searchBook("hi!");
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.lang.Class<?> wildcardClass33 = bookList32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("hi!");
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("hi!");
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        java.lang.Class<?> wildcardClass33 = searchBookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList18 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList20 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList22 = bookData0.searchBooks("hi!");
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList30 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass33 = searchBookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("");
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass17 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
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
}

