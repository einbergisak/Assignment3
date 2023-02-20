package com.thealgorithms.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    /**
     * Unit-tests for "isValid" method and check that all the branches are covered and tested.
     */
    @Test
    void testOne() {
        assertEquals(true, ValidParentheses.isValid("()"));
    }
  
    @Test
    void testTwo() {
        assertEquals(true, ValidParentheses.isValid("()[]{}"));
    }

    @Test
    void testThree() {
        assertEquals(false, ValidParentheses.isValid("(]"));
    }

    //Assert that the case with input ")(" is covered.
    @Test
    void testFour(){
        assertEquals(false, ValidParentheses.isValid(")("));
    }
    //Assert that the case with input "}{" is covered.
    @Test
    void testFive(){
        assertEquals(false, ValidParentheses.isValid("}{"));
    }
    //Assert that the case with invalid input is covered.
    @Test
    void testSix(){
        assertEquals(false, ValidParentheses.isValid("(}"));
    }
    //Assert that the case with invalid input is covered.
    @Test
    void testSeven(){
        assertEquals(false, ValidParentheses.isValid("{)"));
    }
}
