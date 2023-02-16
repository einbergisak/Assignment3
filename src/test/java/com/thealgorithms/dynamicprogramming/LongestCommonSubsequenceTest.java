package com.thealgorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonSubsequenceTest {

    @Test
    void getLCS(){
        String str1 = "ABCD";
        String str2 = "ABDC";
        String expectedLCS = "ABD";
        String actualLCS = LongestCommonSubsequence.getLCS(str1, str2);
        assertEquals(expectedLCS, actualLCS);
    }
    //
    // @Test
    // void lcsString(){
    //
    // }
    //
    // @Test
    // void main(){
    //
    // }

    @AfterAll
    static void printCoverage(){
        System.out.println(LongestCommonSubsequence.branchesReached);

    }

}
