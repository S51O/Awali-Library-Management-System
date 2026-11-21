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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.Class<?> wildcardClass1 = returnService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.Class<?> wildcardClass5 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.Class<?> wildcardClass4 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Book not found." + "'", str3, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = returnService1.returnBook((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ReturnBook.data.ReturnRepository.getBookById(int)\" because \"this.returnRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass10 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass7 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook(0, (int) '4');
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) ' ', 0);
        java.lang.String str15 = returnService0.returnBook((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook((int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = returnService1.returnBook((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ReturnBook.data.ReturnRepository.getBookById(int)\" because \"this.returnRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook((int) (byte) 1, (int) (short) -1);
        java.lang.String str13 = returnService1.returnBook((-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = returnService1.returnBook((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ReturnBook.data.ReturnRepository.getBookById(int)\" because \"this.returnRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Member ID or Book ID." + "'", str13, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.Class<?> wildcardClass2 = returnService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book not found." + "'", str12, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = returnService1.returnBook(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ReturnBook.data.ReturnRepository.getBookById(int)\" because \"this.returnRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook(10, (int) (short) 1);
        java.lang.String str15 = returnService0.returnBook(100, (int) '#');
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
// flaky "1) test020(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No active loan found for this member and book." + "'", str12, "No active loan found for this member and book.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 100, (int) (short) 100);
        java.lang.String str18 = returnService0.returnBook((int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass19 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook(0, (int) '4');
        java.lang.String str15 = returnService0.returnBook((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook(0, (int) ' ');
        java.lang.Class<?> wildcardClass11 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) ' ', 0);
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass5 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) (byte) -1);
        java.lang.String str9 = returnService0.returnBook((int) (short) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook((int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = returnService1.returnBook((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ReturnBook.data.ReturnRepository.getBookById(int)\" because \"this.returnRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str7 = returnService1.returnBook(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook((int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book not found." + "'", str12, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str7 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass8 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook((int) (byte) 1, (int) (short) -1);
        java.lang.String str13 = returnService1.returnBook((-1), (int) ' ');
        java.lang.String str16 = returnService1.returnBook(100, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Member ID or Book ID." + "'", str13, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Invalid Member ID or Book ID." + "'", str16, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook(10, (int) (short) 1);
        java.lang.String str15 = returnService0.returnBook((int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
// flaky "2) test038(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No active loan found for this member and book." + "'", str12, "No active loan found for this member and book.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = returnService1.returnBook((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ReturnBook.data.ReturnRepository.getBookById(int)\" because \"this.returnRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (byte) 10, 0);
        java.lang.String str18 = returnService0.returnBook((int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass19 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str7 = returnService1.returnBook((int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass8 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook((int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book not found." + "'", str12, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) '4', (int) (short) 0);
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) ' ', 0);
        java.lang.String str15 = returnService0.returnBook((int) (short) 1, (int) '#');
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook((int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook(10, (int) (short) 1);
        java.lang.String str15 = returnService0.returnBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str18 = returnService0.returnBook((int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
// flaky "3) test050(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No active loan found for this member and book." + "'", str12, "No active loan found for this member and book.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str7 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str10 = returnService1.returnBook(0, (int) '#');
        java.lang.Class<?> wildcardClass11 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) '4', (int) (short) 0);
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook((int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = returnService1.returnBook(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ReturnBook.data.ReturnRepository.getBookById(int)\" because \"this.returnRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (int) (byte) 0);
        java.lang.String str15 = returnService0.returnBook((int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 100, (int) (short) 100);
        java.lang.String str18 = returnService0.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str21 = returnService0.returnBook((int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid Member ID or Book ID." + "'", str21, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) (byte) -1);
        java.lang.String str9 = returnService0.returnBook((int) (short) 10, (int) (short) 0);
        java.lang.String str12 = returnService0.returnBook((int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
// flaky "4) test058(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No active loan found for this member and book." + "'", str12, "No active loan found for this member and book.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook((int) ' ', (int) '#');
        java.lang.String str15 = returnService0.returnBook((int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book not found." + "'", str12, "Book not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) '4', (int) (short) 0);
        java.lang.String str9 = returnService0.returnBook((int) '4', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) (byte) -1);
        java.lang.String str9 = returnService0.returnBook((int) (short) 10, (int) (short) 0);
        java.lang.String str12 = returnService0.returnBook((int) (short) 10, (int) (byte) 10);
        java.lang.String str15 = returnService0.returnBook((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
// flaky "5) test062(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No active loan found for this member and book." + "'", str12, "No active loan found for this member and book.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook(0, (int) '4');
        java.lang.String str15 = returnService0.returnBook(1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
// flaky "6) test063(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No active loan found for this member and book." + "'", str15, "No active loan found for this member and book.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 100, (int) (short) 100);
        java.lang.String str18 = returnService0.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str21 = returnService0.returnBook((int) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Book not found." + "'", str21, "Book not found.");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) ' ', 0);
        java.lang.String str15 = returnService0.returnBook((int) (byte) 10, 0);
        java.lang.String str18 = returnService0.returnBook((int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass19 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass7 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Book not found." + "'", str6, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str7 = returnService1.returnBook((int) (byte) 0, (int) '4');
        java.lang.String str10 = returnService1.returnBook((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook((int) (short) 100, (int) '#');
        java.lang.String str15 = returnService0.returnBook((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book not found." + "'", str12, "Book not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook(10, (int) (short) 1);
        java.lang.String str15 = returnService0.returnBook((int) (short) -1, (int) (byte) 1);
        java.lang.String str18 = returnService0.returnBook((int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass19 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
// flaky "7) test070(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No active loan found for this member and book." + "'", str12, "No active loan found for this member and book.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Book not found." + "'", str18, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) (byte) 100, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Book not found." + "'", str6, "Book not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (short) 100, (int) (byte) 100);
        java.lang.String str12 = returnService0.returnBook(10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook((-1), (-1));
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook(0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = returnService1.returnBook(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ReturnBook.data.ReturnRepository.getBookById(int)\" because \"this.returnRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (byte) 10, 0);
        java.lang.String str18 = returnService0.returnBook((-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) ' ', 0);
        java.lang.String str15 = returnService0.returnBook((int) (byte) 10, 0);
        java.lang.String str18 = returnService0.returnBook(1, (int) (short) 100);
        java.lang.String str21 = returnService0.returnBook((int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Book not found." + "'", str18, "Book not found.");
// flaky "8) test076(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No active loan found for this member and book." + "'", str21, "No active loan found for this member and book.");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) ' ', 0);
        java.lang.String str15 = returnService0.returnBook(0, (int) (short) 100);
        java.lang.String str18 = returnService0.returnBook((int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Book not found." + "'", str18, "Book not found.");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str7 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str10 = returnService1.returnBook(0, (int) '#');
        java.lang.String str13 = returnService1.returnBook((int) (byte) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Member ID or Book ID." + "'", str13, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook((int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = returnService1.returnBook((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ReturnBook.data.ReturnRepository.getBookById(int)\" because \"this.returnRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook(0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 100, (int) (short) 100);
        java.lang.String str18 = returnService0.returnBook(0, (int) (short) 0);
        java.lang.String str21 = returnService0.returnBook((int) '4', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Book not found." + "'", str21, "Book not found.");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook(10, (int) (short) 1);
        java.lang.String str15 = returnService0.returnBook(0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
// flaky "9) test082(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No active loan found for this member and book." + "'", str12, "No active loan found for this member and book.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 100, (int) (short) 100);
        java.lang.String str18 = returnService0.returnBook(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) '4', (int) (short) 100);
        java.lang.String str6 = returnService0.returnBook((int) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Book not found." + "'", str3, "Book not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Book not found." + "'", str6, "Book not found.");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook(10, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
// flaky "10) test085(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No active loan found for this member and book." + "'", str12, "No active loan found for this member and book.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook((int) (byte) 1, (int) (short) -1);
        java.lang.String str13 = returnService1.returnBook(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Member ID or Book ID." + "'", str13, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 100, (int) (short) 100);
        java.lang.String str18 = returnService0.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str21 = returnService0.returnBook((int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid Member ID or Book ID." + "'", str21, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 100, (int) (short) 100);
        java.lang.String str18 = returnService0.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str21 = returnService0.returnBook((int) (short) 100, (int) (short) -1);
        java.lang.String str24 = returnService0.returnBook(0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid Member ID or Book ID." + "'", str21, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid Member ID or Book ID." + "'", str24, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) '4', (int) (short) 100);
        java.lang.String str6 = returnService0.returnBook((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass7 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Book not found." + "'", str3, "Book not found.");
// flaky "11) test089(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No active loan found for this member and book." + "'", str6, "No active loan found for this member and book.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) (byte) 1, (int) (short) -1);
        java.lang.String str9 = returnService0.returnBook((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str7 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str10 = returnService1.returnBook(0, (int) '#');
        java.lang.String str13 = returnService1.returnBook((int) (byte) -1, (int) (short) 10);
        java.lang.String str16 = returnService1.returnBook((int) '#', 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Member ID or Book ID." + "'", str13, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Invalid Member ID or Book ID." + "'", str16, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook(10, (int) (short) 1);
        java.lang.String str15 = returnService0.returnBook(100, (int) '#');
        java.lang.String str18 = returnService0.returnBook((-1), (int) (byte) 0);
        java.lang.String str21 = returnService0.returnBook((int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
// flaky "12) test092(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No active loan found for this member and book." + "'", str12, "No active loan found for this member and book.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Book not found." + "'", str21, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((-1), 100);
        java.lang.String str7 = returnService1.returnBook(0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (byte) -1, (int) (byte) -1);
        java.lang.String str15 = returnService0.returnBook((int) ' ', (int) '4');
        java.lang.String str18 = returnService0.returnBook((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(1, (int) (short) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) 100, 100);
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
// flaky "13) test095(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No active loan found for this member and book." + "'", str9, "No active loan found for this member and book.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book not found." + "'", str12, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(100, (int) (byte) 100);
        java.lang.String str12 = returnService0.returnBook((int) '#', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook((int) (byte) -1, (int) (short) 1);
        java.lang.String str15 = returnService0.returnBook(0, (int) ' ');
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook((int) (byte) -1, (int) (short) 1);
        java.lang.String str15 = returnService0.returnBook((int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
// flaky "14) test098(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No active loan found for this member and book." + "'", str15, "No active loan found for this member and book.");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) ' ', 0);
        java.lang.String str15 = returnService0.returnBook((int) (byte) 10, 0);
        java.lang.String str18 = returnService0.returnBook(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Book not found." + "'", str18, "Book not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((int) (short) -1, (int) ' ');
        java.lang.String str6 = returnService0.returnBook((int) (byte) 100, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Book not found." + "'", str6, "Book not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook((int) ' ', (int) '#');
        java.lang.String str15 = returnService0.returnBook((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book not found." + "'", str12, "Book not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (byte) 10, 0);
        java.lang.String str18 = returnService0.returnBook((int) (short) -1, (int) '4');
        java.lang.String str21 = returnService0.returnBook((int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid Member ID or Book ID." + "'", str21, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook((int) (short) 100, (int) '#');
        java.lang.String str15 = returnService0.returnBook((int) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book not found." + "'", str12, "Book not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str7 = returnService1.returnBook((int) (byte) -1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = returnService1.returnBook((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ReturnBook.data.ReturnRepository.getBookById(int)\" because \"this.returnRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook((int) (byte) 1, (int) (short) -1);
        java.lang.String str13 = returnService1.returnBook(0, (int) (short) 10);
        java.lang.String str16 = returnService1.returnBook((int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Member ID or Book ID." + "'", str13, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Invalid Member ID or Book ID." + "'", str16, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook((int) ' ', (int) '#');
        java.lang.String str15 = returnService0.returnBook((int) (short) 1, (-1));
        java.lang.String str18 = returnService0.returnBook(1, (-1));
        java.lang.String str21 = returnService0.returnBook((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book not found." + "'", str12, "Book not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid Member ID or Book ID." + "'", str21, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) ' ', 0);
        java.lang.String str15 = returnService0.returnBook((int) (short) 1, (int) '#');
        java.lang.String str18 = returnService0.returnBook(0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook((int) '#', (int) (byte) 0);
        java.lang.String str10 = returnService1.returnBook((int) (byte) 1, (int) (short) -1);
        java.lang.String str13 = returnService1.returnBook(10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Member ID or Book ID." + "'", str10, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Member ID or Book ID." + "'", str13, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (short) 100, (int) (byte) 100);
        java.lang.String str12 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook((-1), (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) '4', (int) (short) 0);
        java.lang.String str15 = returnService0.returnBook((int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = returnService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
// flaky "15) test112(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No active loan found for this member and book." + "'", str15, "No active loan found for this member and book.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook(0, (int) (short) 100);
        java.lang.String str15 = returnService0.returnBook(0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 100, (int) (short) 100);
        java.lang.String str18 = returnService0.returnBook((int) (byte) -1, (int) ' ');
        java.lang.String str21 = returnService0.returnBook((int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book not found." + "'", str15, "Book not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Book not found." + "'", str21, "Book not found.");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) '#', (int) (short) 100);
        java.lang.String str12 = returnService0.returnBook(10, (int) (short) 1);
        java.lang.String str15 = returnService0.returnBook((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book not found." + "'", str9, "Book not found.");
// flaky "16) test115(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No active loan found for this member and book." + "'", str12, "No active loan found for this member and book.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) '4', (int) (short) 0);
        java.lang.String str15 = returnService0.returnBook(1, (int) (short) 0);
        java.lang.String str18 = returnService0.returnBook((-1), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook((int) (byte) 0, 100);
        java.lang.String str12 = returnService0.returnBook((int) ' ', (int) '#');
        java.lang.String str15 = returnService0.returnBook((int) (short) 1, (-1));
        java.lang.String str18 = returnService0.returnBook((int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book not found." + "'", str12, "Book not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (short) 10, (int) (byte) 1);
        java.lang.String str18 = returnService0.returnBook(1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
// flaky "17) test118(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No active loan found for this member and book." + "'", str15, "No active loan found for this member and book.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Book not found." + "'", str18, "Book not found.");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (byte) 10, 0);
        java.lang.String str18 = returnService0.returnBook((int) (short) -1, (int) '4');
        java.lang.String str21 = returnService0.returnBook(10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid Member ID or Book ID." + "'", str21, "Invalid Member ID or Book ID.");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ReturnBook.data.ReturnRepository returnRepository0 = null;
        ReturnBook.business.ReturnService returnService1 = new ReturnBook.business.ReturnService(returnRepository0);
        java.lang.String str4 = returnService1.returnBook(0, (int) 'a');
        java.lang.String str7 = returnService1.returnBook(1, 0);
        java.lang.Class<?> wildcardClass8 = returnService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Member ID or Book ID." + "'", str4, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Member ID or Book ID." + "'", str7, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ReturnBook.business.ReturnService returnService0 = new ReturnBook.business.ReturnService();
        java.lang.String str3 = returnService0.returnBook((-1), 1);
        java.lang.String str6 = returnService0.returnBook((int) (short) 0, (int) '#');
        java.lang.String str9 = returnService0.returnBook(0, (int) (byte) 10);
        java.lang.String str12 = returnService0.returnBook((int) (short) -1, (-1));
        java.lang.String str15 = returnService0.returnBook((int) (byte) 10, 0);
        java.lang.String str18 = returnService0.returnBook((int) (short) -1, (int) '4');
        java.lang.String str21 = returnService0.returnBook((-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid Member ID or Book ID." + "'", str3, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Member ID or Book ID." + "'", str6, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Member ID or Book ID." + "'", str9, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Member ID or Book ID." + "'", str12, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Member ID or Book ID." + "'", str15, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Member ID or Book ID." + "'", str18, "Invalid Member ID or Book ID.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid Member ID or Book ID." + "'", str21, "Invalid Member ID or Book ID.");
    }
}
