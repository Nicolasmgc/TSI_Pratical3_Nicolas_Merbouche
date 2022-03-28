package com.tsi.java.Exercice5;

import java.util.ArrayList;
import java.util.List;

public class PersonProcessingWithStreams {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Max", 28));
        people.add(new Person("Peter", 22));
        people.add(new Person("Anna", 28));
        people.add(new Person("Lilianna", 16));
        people.add(new Person("Pamela", 13));
        people.add(new Person("David", 22));

        PersonEvaluator personEvaluator = new PersonEvaluator(people);

        personEvaluator.findAndPrint();

    }
}
