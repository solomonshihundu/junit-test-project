package com.ss.unittesting;

public class ArithmeticOperation
{
    int addOp(int [] numbers)
    {
        int sum = 0;

        for(int i:numbers)
        {
            sum += i;
        }

        return sum;
    }
}
