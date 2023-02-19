package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void exampleTest() {

        int[][] a = {
                {1,2},
                {3, 2}};

        int[][] b = {
                {3,2},
                {1, 1}};

        int[][] expected = {
                {5, 4},
                {11, 8}};

        int[][] actual = Kata.matrixMultiplication(a, b);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void basicTest() {

        {
            int[][] a = {
                    { 9, 7 },
                    { 0, 1 }};

            int[][] b = {
                    { 1, 1 },
                    { 4, 12 }};

            int[][] expected = {
                    { 37, 93 },
                    { 4, 12 }};

            int[][] actual = Kata.matrixMultiplication(a, b);
            assertArrayEquals(expected, actual);
        }

        {

            int[][] a = {
                    { 1, 2, 3 },
                    { 3, 2, 1 },
                    { 2, 1, 3 }};

            int[][] b = {
                    { 4, 5, 6 },
                    { 6, 5, 4 },
                    { 4, 6, 5 }};

            int[][] expected = {
                    { 28, 33, 29 },
                    { 28, 31, 31 },
                    { 26, 33, 31 }};

            int[][] actual = Kata.matrixMultiplication(a, b);
            assertArrayEquals(expected, actual);
        }
    }
    @Test
    public void tests() {
        assertEquals("(123) 456-7890",
                Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    @DisplayName("n = 3")
    void test3() {
        int[][] test = {{1,2,3},{2,4,6},{3,6,9}};
        assertArrayEquals(test,
                Kata.multiplicationTable(3));
    }
    @Test
    @DisplayName("n = 1")
    void test1(){
        int[][] test1 = {{1}};
        assertArrayEquals(test1,
                Kata.multiplicationTable(1));
    }
    @Test
    public void test_01() {
        assertEquals(0, Kata.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, Kata.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, Kata.sortDesc(123456789));
    }
    @Test
    public void test() {
        assertEquals(811181,
                new Kata().squareDigits(9119));
        assertEquals(0,
                new Kata().squareDigits(0));
    }
    private static void doTest(String str, String expected) {
        assertEquals(expected,
                Kata.incrementString(str), "input: <"+str+">");
    }

    @Test
    public void exampleTests() {
        doTest("foobar000", "foobar001");
        doTest("foo", "foo1");
        doTest("foobar001", "foobar002");
        doTest("foobar99", "foobar100");
        doTest("foobar099", "foobar100");
        doTest("", "1");
    }
    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("Should handle even string","[ab, cd, ef]",
                Arrays.toString(Kata.solution(s)));
        assertEquals("Should handle even string","[He, ll, oW, or, ld]",
                Arrays.toString(Kata.solution(s1)));
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("Should handle odd string",
                "[ab, cd, e_]", Arrays.toString(Kata.solution(s)));
        assertEquals("Should handle odd string",
                "[Lo, ve, Pi, zz, a_]", Arrays.toString(Kata.solution(s1)));
    }
    @Test
    public void exampleTests1() {
        assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
