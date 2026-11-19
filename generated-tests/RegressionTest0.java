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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.lang.Class<?> wildcardClass1 = bookData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass3 = bookList2.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass5 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.lang.Class<?> wildcardClass1 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass3 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass7 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass3 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass7 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass5 = bookList4.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass7 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass5 = bookList4.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass3 = bookList2.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass5 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass5 = bookList4.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass5 = bookList4.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass9 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass9 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass5 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass7 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass9 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass7 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass7 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass7 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass7 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass9 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass3 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass7 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass9 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass5 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass9 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass3 = bookList2.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass7 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass9 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass5 = bookList4.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass9 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass5 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass9 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
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
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass3 = bookList2.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        java.util.List<SearchBook.Data.Book> bookList32 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList34 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass35 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass9 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList16 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList18 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList20 = searchBookService0.searchBook("");
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass5 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass9 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
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
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
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
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        java.util.List<SearchBook.Data.Book> bookList24 = bookData0.searchBooks("");
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.lang.Class<?> wildcardClass35 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.lang.Class<?> wildcardClass7 = bookData0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        java.lang.Class<?> wildcardClass35 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        java.lang.Class<?> wildcardClass35 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        java.lang.Class<?> wildcardClass35 = searchBookService0.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList14 = searchBookService0.searchBook("hi!");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = searchBookService0.searchBook("");
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("");
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("");
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = searchBookService0.searchBook("");
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.util.List<SearchBook.Data.Book> bookList26 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList28 = searchBookService0.searchBook("");
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList12 = bookData0.searchBooks("hi!");
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        SearchBook.Business.SearchBookService searchBookService0 = new SearchBook.Business.SearchBookService();
        java.util.List<SearchBook.Data.Book> bookList2 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList4 = searchBookService0.searchBook("");
        java.util.List<SearchBook.Data.Book> bookList6 = searchBookService0.searchBook("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = searchBookService0.searchBook("hi!");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList10 = bookData0.searchBooks("hi!");
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList8 = bookData0.searchBooks("");
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        SearchBook.Data.BookData bookData0 = new SearchBook.Data.BookData();
        java.util.List<SearchBook.Data.Book> bookList2 = bookData0.searchBooks("");
        java.util.List<SearchBook.Data.Book> bookList4 = bookData0.searchBooks("hi!");
        java.util.List<SearchBook.Data.Book> bookList6 = bookData0.searchBooks("hi!");
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
}

