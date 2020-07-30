package com.ss.unittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationTest
{
    ArithmeticOperation  arithmeticOperation = new ArithmeticOperation();
    /**
     * addOp(1,2,3)->6
     */
    @Test
    public  void sumOfThree()
    {

        /**
         * check if result  equals expected value
         */
        assertEquals(6,arithmeticOperation.addOp(new int[]{1,2,3}));


    }


    /**
     * addOp(3)->3
     */
    @Test
    public  void sumOfOne()
    {

        /**
         * check if result  equals expected value
         */
        assertEquals(3,arithmeticOperation.addOp(new int[]{3}));


    }
}
