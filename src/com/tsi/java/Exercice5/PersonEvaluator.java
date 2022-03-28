package com.tsi.java.Exercice5;

import java.util.List;
import java.util.stream.Collectors;

public class PersonEvaluator {
    final List<Person> people;

    public PersonEvaluator(List<Person> people) {
        this.people = people;
    }

    void findAndPrint() {
        people.stream()
                .filter(person -> person.name.startsWith("P"))
                .filter(person -> person.age > 18)
                .forEach(System.out::println);
    }

   /* void groupAndPrint() {
        people.stream()
                .filter(person -> person.age == 13)
                .collect(Collectors.joining("Age:", "d", "f"))
                .forEach(System.out::println);*/


    }
