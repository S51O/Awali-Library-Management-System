package generated.member;

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
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        java.lang.Class<?> wildcardClass3 = member2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        java.lang.Class<?> wildcardClass5 = member2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((-1), "");
        java.lang.Class<?> wildcardClass3 = member2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        java.lang.String str3 = member2.getName();
        java.lang.Class<?> wildcardClass4 = member2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        int int3 = member2.getMemberId();
        java.lang.String str4 = member2.getName();
        java.lang.Class<?> wildcardClass5 = member2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) 'a', "");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(1, "");
        java.lang.String str3 = member2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) '#', "");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) '4', "hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.getName();
        java.lang.Class<?> wildcardClass6 = member2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) -1, "");
        java.lang.String str3 = member2.getName();
        java.lang.Class<?> wildcardClass4 = member2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass3 = member2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.getName();
        int int6 = member2.getMemberId();
        int int7 = member2.getMemberId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 10, "hi!");
        int int3 = member2.getMemberId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        int int3 = member2.getMemberId();
        int int4 = member2.getMemberId();
        java.lang.Class<?> wildcardClass5 = member2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 0, "hi!");
        int int3 = member2.getMemberId();
        int int4 = member2.getMemberId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) -1, "");
        int int3 = member2.getMemberId();
        java.lang.Class<?> wildcardClass4 = member2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(10, "hi!");
        java.lang.Class<?> wildcardClass3 = member2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 0, "hi!");
        java.lang.String str3 = member2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((-1), "");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        int int5 = member2.getMemberId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 10, "hi!");
        java.lang.String str3 = member2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        java.lang.String str3 = member2.getName();
        int int4 = member2.getMemberId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 100, "");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(1, "");
        java.lang.Class<?> wildcardClass3 = member2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) -1, "");
        int int3 = member2.getMemberId();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        int int3 = member2.getMemberId();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.getName();
        java.lang.String str6 = member2.getName();
        java.lang.String str7 = member2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) ' ', "");
        java.lang.String str3 = member2.getName();
        int int4 = member2.getMemberId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) -1, "");
        java.lang.Class<?> wildcardClass3 = member2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) 100, "");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((-1), "");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        java.lang.Class<?> wildcardClass5 = member2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) '4', "");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        int int3 = member2.getMemberId();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.getName();
        int int6 = member2.getMemberId();
        java.lang.Class<?> wildcardClass7 = member2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) 10, "hi!");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        int int3 = member2.getMemberId();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.getName();
        java.lang.String str6 = member2.getName();
        int int7 = member2.getMemberId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 10, "");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) '#', "hi!");
        java.lang.Class<?> wildcardClass3 = member2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) 'a', "hi!");
        java.lang.Class<?> wildcardClass3 = member2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) 10, "");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.getName();
        int int6 = member2.getMemberId();
        java.lang.String str7 = member2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.getName();
        int int6 = member2.getMemberId();
        java.lang.Class<?> wildcardClass7 = member2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) 'a', "hi!");
        java.lang.String str3 = member2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(10, "hi!");
        int int3 = member2.getMemberId();
        java.lang.Class<?> wildcardClass4 = member2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(1, "");
        int int3 = member2.getMemberId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((-1), "");
        int int3 = member2.getMemberId();
        java.lang.Class<?> wildcardClass4 = member2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) 0, "");
        java.lang.String str3 = member2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(100, "");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 1, "");
        java.lang.String str3 = member2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 1, "");
        java.lang.Class<?> wildcardClass3 = member2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        int int3 = member2.getMemberId();
        java.lang.String str4 = member2.getName();
        int int5 = member2.getMemberId();
        java.lang.String str6 = member2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(10, "");
        int int3 = member2.getMemberId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((-1), "");
        int int3 = member2.getMemberId();
        int int4 = member2.getMemberId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "");
        java.lang.String str3 = member2.getName();
        int int4 = member2.getMemberId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 100, "hi!");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((-1), "");
        java.lang.String str3 = member2.getName();
        int int4 = member2.getMemberId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((-1), "");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.getName();
        int int6 = member2.getMemberId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) 1, "");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) -1, "");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        int int5 = member2.getMemberId();
        int int6 = member2.getMemberId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) ' ', "hi!");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member(0, "hi!");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        int int5 = member2.getMemberId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (short) 1, "hi!");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        BorrowBook.Models.Member member2 = new BorrowBook.Models.Member((int) (byte) -1, "");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }
}

