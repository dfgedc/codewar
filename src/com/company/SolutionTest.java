package com.company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertEquals(true,
                Solution.validParentheses( "()" ));
        assertEquals(false,
                Solution.validParentheses( "())" ));
        assertEquals(true,
                Solution.validParentheses( "32423(sgsdg)" ));
        assertEquals(false,
                Solution.validParentheses( "(dsgdsg))2432" ));
        assertEquals(true,
                Solution.validParentheses( "adasdasfa" ));
    }
    @Test
    public void staticTests() {
        assertEquals("no one likes this",
                Solution.whoLikesIt());
        assertEquals("Peter likes this",
                Solution.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this",
                Solution.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this",
                Solution.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this",
                Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    @Test
    void test() {
        assertEquals("4838833807747564492684688990217",
                Kata.sumStrings("5023852115031", "4838833807747564487660836875186"));
        assertEquals("8670",
                Kata.sumStrings("", "08567"));
    }

    @Test
    void basicTests() {
        assertEquals("2",
                Kata.add("1", "1"));
        assertEquals("579",
                Kata.add("123", "456"));
        assertEquals("1110",
                Kata.add("888", "222"));
        assertEquals("1441",
                Kata.add("1372", "69"));
        assertEquals("468",
                Kata.add("12", "456"));
        assertEquals("201",
                Kata.add("100", "101"));
        assertEquals("91002328220491911630239667963",
                Kata.add("63829983432984289347293874", "90938498237058927340892374089"));
    }

    private static void test(String input, String expectedOutput) {
        test(input, expectedOutput, "");
    }
    private static void test(String input, String expectedOutput, String message) {
      //  MyFirstInterpreter interpreter = new MyFirstInterpreter(input);
        //assertEquals(message, expectedOutput, interpreter.interpret());
    }

    @Test
    public void shouldWorkForExampleProgramsProvidedInDescription() {
        test("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+++++++++++++++++++++++++++++.+++++++..+++.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+++++++++++++++++++++++++++++++++++++++++++++++++++++++.++++++++++++++++++++++++.+++.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.",
                "Hello, World!");

        test("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 },
                Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 },
                Kata.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{},
                Kata.sortArray(new int[]{}));
    }
    @Test
    public void sampleTests() {
        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kata.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kata.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa",
                Kata.high("aa b"));
        assertEquals("b",
                Kata.high("b aa"));
        assertEquals("bb",
                Kata.high("bb d"));
        assertEquals("d",
                Kata.high("d bb"));
        assertEquals("aaa", Kata.high("aaa b"));
    }
    @Test
    public void test_BasicTests() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20",
                Solution.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));

        assertEquals("-3--1,2,10,15,16,18-20",
                Solution.rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
    }
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior",
                Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior",
                Solution.toCamelCase(input));
    }
}
