package com.thealgorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonSubsequenceTest {

    /**
     * Test if two input strings are different
     */
    @Test
    void twoDifferentStrings(){
        String str1 = "ABCD";
        String str2 = "ABDC";
        String expectedLCS = "ABD";
        String actualLCS = LongestCommonSubsequence.getLCS(str1, str2);
        assertEquals(expectedLCS, actualLCS);
    }

    /**
     * Test if two input strings are the same
     */
    @Test
    void twoIdenticalStrings(){
        String str1 = "ABD";
        String str2 = "ABD";
        String expectedLCS = "ABD";
        String actualLCS = LongestCommonSubsequence.getLCS(str1, str2);
        assertEquals(expectedLCS, actualLCS);
    }

    /**
     * Test if two input strings share no common characters 
     */
    @Test
    void noSharedCharacters(){
        String str1 = "ABC";
        String str2 = "DEF";
        String expectedLCS = "";
        String actualLCS = LongestCommonSubsequence.getLCS(str1, str2);
        assertEquals(expectedLCS, actualLCS);
    }

    /**
     * Test if one input arg (which should be a string), is null
     */
    @Test
    void oneNullString(){
        String str1 = null;
        String str2 = "ABDC";
        String expectedLCS = null;
        String actualLCS = LongestCommonSubsequence.getLCS(str1, str2);
        assertEquals(expectedLCS, actualLCS);

    }

    /**
     * Test if one string is empty
     */
    @Test
    void oneEmptyString(){
        String str1 = "";
        String str2 = "ABDC";
        String expectedLCS = "";
        String actualLCS = LongestCommonSubsequence.getLCS(str1, str2);
        assertEquals(expectedLCS, actualLCS);

    }
    
    /**
     * Print coverage report of branches reached
     */
    @AfterAll
    static void printCoverage(){
        System.out.println(LongestCommonSubsequence.branchesReached);

    }

}
