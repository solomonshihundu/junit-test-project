package com.ss.unittesting;

import org.junit.*;

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
        System.out.println("TEST OF 3 NUMS");


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
        System.out.println("TEST OF 1 NUM");


    }

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("BEGINNING OF TESTNG");
    }

    @Before
    public  void beforeTest()
    {
        System.out.println("BEFORE UNIT TEST");
    }

    @After
    public  void afterTest()
    {
        System.out.println("AFTER UNIT TEST");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("END OF TESTING");
    }


}

