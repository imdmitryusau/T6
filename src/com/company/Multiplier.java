package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Multiplier {

    public int add(int a, int b) //a
    {
        return a + b;
    }

    public int add(int a, int b, int c, int d) //b using the method above
    {
        return add(a,b)+c+d;
    }

    public double add(double a, double b) //c
    {
        return a + b;
    }

    public double addBigDecimal(double a, double b) //d
    {
        BigDecimal a1 =new BigDecimal(a);
        BigDecimal b1 =new BigDecimal(b);
        return a1.add(b1).doubleValue();
    }

    public  int addList(ArrayList<Integer> IntegerList) //e
    {
        int t=0;
        for (Integer element : IntegerList) {
            t+=element;
        }
        return t;
    }
}

