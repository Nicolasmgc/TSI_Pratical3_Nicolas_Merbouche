package com.tsi.java.Exercice4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListFour {
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
        list.stream()
                .filter(student -> student.substring(0, 1).matches("c"))
                .map(student -> student.toUpperCase(Locale.ROOT))
                .sorted()
                .forEach(System.out::println) ;



    }
}
