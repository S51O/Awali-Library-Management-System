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
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "", false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 0, "", "hi!", "", false);
        java.lang.String str6 = book5.getAuthor();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 0, "", "hi!", "", false);
        boolean boolean6 = book5.isAvailable();
        boolean boolean7 = book5.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 0, "", "hi!", "", false);
        book5.setAvailable(false);
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        boolean boolean6 = book5.isAvailable();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        boolean boolean6 = book5.isAvailable();
        int int7 = book5.getBookId();
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book(1, "", "", "", true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getAuthor();
        boolean boolean8 = book5.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        boolean boolean6 = book5.isAvailable();
        book5.setAvailable(true);
        java.lang.String str9 = book5.getAuthor();
        boolean boolean10 = book5.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) '#', "", "hi!", "hi!", true);
        int int6 = book5.getBookId();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book(0, "hi!", "hi!", "hi!", true);
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book(0, "hi!", "hi!", "hi!", true);
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        boolean boolean6 = book5.isAvailable();
        int int7 = book5.getBookId();
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 100, "hi!", "", "", false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        book5.setAvailable(true);
        int int8 = book5.getBookId();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        java.lang.String str6 = book5.getAuthor();
        boolean boolean7 = book5.isAvailable();
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookId();
        java.lang.String str10 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book(0, "", "hi!", "", false);
        int int6 = book5.getBookId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        java.lang.String str6 = book5.getAuthor();
        boolean boolean7 = book5.isAvailable();
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getIsbn();
        boolean boolean10 = book5.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book(10, "", "", "", false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((-1), "", "", "hi!", false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        java.lang.String str6 = book5.getAuthor();
        boolean boolean7 = book5.isAvailable();
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        boolean boolean6 = book5.isAvailable();
        java.lang.String str7 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 0, "hi!", "hi!", "hi!", false);
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) '#', "", "hi!", "hi!", true);
        int int6 = book5.getBookId();
        book5.setAvailable(true);
        java.lang.String str9 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (byte) 100, "", "", "", false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 0, "", "hi!", "", false);
        java.lang.String str6 = book5.getAuthor();
        boolean boolean7 = book5.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        java.lang.String str6 = book5.getAuthor();
        boolean boolean7 = book5.isAvailable();
        boolean boolean8 = book5.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 0, "", "hi!", "", false);
        book5.setAvailable(false);
        java.lang.String str8 = book5.getTitle();
        book5.setAvailable(true);
        book5.setAvailable(false);
        java.lang.String str13 = book5.getIsbn();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        boolean boolean6 = book5.isAvailable();
        book5.setAvailable(true);
        java.lang.String str9 = book5.getAuthor();
        int int10 = book5.getBookId();
        int int11 = book5.getBookId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        boolean boolean6 = book5.isAvailable();
        book5.setAvailable(true);
        boolean boolean9 = book5.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) ' ', "", "", "hi!", true);
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        boolean boolean6 = book5.isAvailable();
        int int7 = book5.getBookId();
        java.lang.String str8 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (byte) 100, "hi!", "hi!", "", false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) ' ', "hi!", "", "hi!", false);
        java.lang.String str6 = book5.getTitle();
        book5.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        book5.setAvailable(true);
        int int8 = book5.getBookId();
        book5.setAvailable(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) '4', "", "", "hi!", false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (byte) 0, "", "", "", true);
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) ' ', "", "", "hi!", true);
        book5.setAvailable(false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) ' ', "hi!", "", "hi!", false);
        java.lang.String str6 = book5.getTitle();
        boolean boolean7 = book5.isAvailable();
        java.lang.String str8 = book5.getIsbn();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 0, "", "hi!", "", false);
        book5.setAvailable(false);
        boolean boolean8 = book5.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book(0, "hi!", "", "", true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book(100, "hi!", "hi!", "", true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 0, "", "hi!", "", false);
        int int6 = book5.getBookId();
        book5.setAvailable(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book(0, "", "hi!", "", false);
        java.lang.String str6 = book5.getAuthor();
        int int7 = book5.getBookId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) ' ', "", "", "hi!", true);
        java.lang.String str6 = book5.getTitle();
        book5.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 0, "", "hi!", "", false);
        book5.setAvailable(false);
        java.lang.String str8 = book5.getTitle();
        book5.setAvailable(true);
        book5.setAvailable(false);
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getIsbn();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book(35, "hi!", "", "hi!", true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book(10, "hi!", "", "", true);
        boolean boolean6 = book5.isAvailable();
        java.lang.String str7 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        book5.setAvailable(true);
        int int8 = book5.getBookId();
        book5.setAvailable(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) -1, "hi!", "", "hi!", true);
        java.lang.String str6 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        boolean boolean6 = book5.isAvailable();
        book5.setAvailable(true);
        java.lang.String str9 = book5.getTitle();
        boolean boolean10 = book5.isAvailable();
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) (short) 0, "hi!", "hi!", "hi!", false);
        java.lang.String str6 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) ' ', "", "", "hi!", true);
        int int6 = book5.getBookId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) ' ', "hi!", "", "hi!", false);
        java.lang.String str6 = book5.getTitle();
        boolean boolean7 = book5.isAvailable();
        book5.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        BorrowBook.Models.Book book5 = new BorrowBook.Models.Book((int) 'a', "hi!", "", "hi!", true);
        boolean boolean6 = book5.isAvailable();
        java.lang.String str7 = book5.getIsbn();
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }
}

