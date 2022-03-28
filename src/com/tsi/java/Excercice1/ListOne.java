package com.tsi.java.Excercice1;

import java.util.ArrayList;
import java.util.List;

public class ListOne {
    public static void main(String args[])
    {
        List<String> list = new ArrayList<String>(){
            {
                add("a1");
                add("c3");
                add("a2");
                add("a3");
                add("b3");
                add("b2");
                add("c1");
                add("c2");
                add("b1");
            }
        };

        System.out.println("First element " + list.get(1));
    }
}
