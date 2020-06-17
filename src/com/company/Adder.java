package com.company;

import java.math.BigDecimal;

public class Adder {

    static int add(int a, int b)
    {
    int s=a+b;
    return s;
    }

    static BigDecimal add(double a, double b)
    {
        BigDecimal a1 =new BigDecimal(a);
        BigDecimal b1 =new BigDecimal(b);
        BigDecimal b2 =new BigDecimal(a+b);
        return b2;
    }
}
