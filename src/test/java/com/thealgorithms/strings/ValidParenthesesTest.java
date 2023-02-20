package com.thealgorithms.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
	
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
    @Test
    void testFour(){
        assertEquals(false, ValidParentheses.isValid(")("));
    }
    @Test
    void testFive(){
        assertEquals(false, ValidParentheses.isValid("}{"));
    }
    @Test
    void testSix(){
        assertEquals(false, ValidParentheses.isValid("(}"));
    }
    @Test
    void testSeven(){
        assertEquals(false, ValidParentheses.isValid("(}"));
    }
}
