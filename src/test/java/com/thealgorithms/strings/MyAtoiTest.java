package com.thealgorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.lang.Boolean;

public class MyAtoiTest {
	
    // create data struct of coverage info about specific branches
    // [nloc, ccn, token, param, length]
    private int[] classCoverage = {75, 37, 447, 1, 82};
    
    // scheme follows = nFunction.nBranch
    private double testOneIDb0 = 0.0;
    private double testTwoIDb0 = 1.0;
    private double testThreeIDb0 = 0.0;
 
    private boolean branchReached = false;
    
    @Test
    void testOne() {
        // add flag to be added to data struct
        assertEquals(42, MyAtoi.myAtoi("42"));
        branchReached = true;
    }
  
      @Test
    void testTwo() {
        assertEquals(-42, MyAtoi.myAtoi("   -42"));
    }
  
  
      @Test
    void testThree() {
        assertEquals(4193, MyAtoi.myAtoi("4193 with words"));
    }

    // write information of given branches to file
      @Test
    void writeReport(){

        System.out.println(Arrays.toString(classCoverage));
        System.out.println(testOneIDb0);
        System.out.println(branchReached);
    }
}
