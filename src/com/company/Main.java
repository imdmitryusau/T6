package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 1
        Multiplier c = new Multiplier();
        System.out.println("A " + c.add(5,7)); //a (accepting as arguments two variables of type int)
        System.out.println("B " + c.add(5,7, 8,9)); //b (accepting 4 variables of type int as arguments (this method should call the above method in its body accepting two parameters of type int)
        System.out.println("C " + c.add(5d,7d)); //c (accepting 2 double variables as arguments / d if for double)
        System.out.println("D " + c.addBigDecimal(5,7)); //d (accepting two BigDecimal objects as arguments)

        ArrayList<Integer> var = new ArrayList<>(); //e (taking as a argument a list of Integer objects)
        var.add(1);
        var.add(2);
        System.out.println("E " + c.addList(var));

        int s;
        Adder adder = new Adder();
        s=adder.add(1,2); //a
        System.out.println(s);
        System.out.println(adder.add(5, 4)); //b

        //Task 2
        Address address = new Address();
        address.createAddress("Poland");//a (country)
        address.createAddress("Poland", "Warsaw"); //b (country, city)
        address.createAddress("Poland", "Warsaw", "F12345"); //c (country, city, postal code)
        address.createAddress("Poland", "Warsaw", "G123456", "GrandOne"); //d (country, city, postal code, street name)
        address.createAddress("Poland", "Warsaw", "H123456", "SmallOne", 123); //e (country, city, postal code, street name, apartment number)







    }
}
