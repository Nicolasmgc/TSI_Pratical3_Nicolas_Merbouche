package com.tsi.java.Excercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListTwo {
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
                .map(student -> student.toUpperCase(Locale.ROOT))
                .forEach(student -> System.out.println(student));


    }
}
