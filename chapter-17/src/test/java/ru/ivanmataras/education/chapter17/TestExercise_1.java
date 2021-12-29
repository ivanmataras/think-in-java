package ru.ivanmataras.education.chapter17;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.stream.Collectors.toCollection;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_1 {

    @Test
    @Order(1)
    void testExercise_1() {

        List<Integer> arrayListOfInteger = Stream.iterate(1, n -> n + 1).limit(10).collect(toCollection(ArrayList::new));
        List<Integer> linkedListOfInteger = Stream.iterate(1, n -> n + 1).limit(10).collect(toCollection(LinkedList::new));

        Set<Integer> hashSetOfInteger = Stream.iterate(1, n -> n + 1).limit(10).collect(toCollection(HashSet::new));
        Set<Integer> treeSetOfInteger = Stream.iterate(1, n -> n + 1).limit(10).collect(toCollection(TreeSet::new));
        Set<Integer> linkedHashSetOfInteger = Stream.iterate(1, n -> n + 1).limit(10).collect(toCollection(LinkedHashSet::new));

    }

    @Test
    @Order(2)
    void testFillCollectionsWithPersons() {

        Person person1 = new Person(1, "Владимир", "Владимирович", "Путин", LocalDate.of(1952, 10, 7));
        Person person2 = new Person(2, "Борис", "Николаевич", "Ельцин", LocalDate.of(1931, 2, 1));
        Person person3 = new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2));
        Person person4 = new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2));

        List<Person> personsArrayList = new ArrayList<Person>();
        personsArrayList.add(person1);
        personsArrayList.add(person2);
        personsArrayList.add(person3);
        personsArrayList.add(person4);

        List<Person> personsLinkedList = new LinkedList<Person>();
        personsLinkedList.add(person1);
        personsLinkedList.add(person2);
        personsLinkedList.add(person3);
        personsLinkedList.add(person4);

        Set<Person> personsHashSet = new HashSet<Person>();
        personsHashSet.add(person1);
        personsHashSet.add(person2);
        personsHashSet.add(person3);
        personsHashSet.add(person4);

        Set<Person> personsLinkedHashSet = new LinkedHashSet<>();
        personsLinkedHashSet.add(person1);
        personsLinkedHashSet.add(person2);
        personsLinkedHashSet.add(person3);
        personsLinkedHashSet.add(person4);

        Set<Person> personsTreeSet = new TreeSet<Person>();
        personsTreeSet.add(person1);
        personsTreeSet.add(person2);
        personsTreeSet.add(person3);
        personsTreeSet.add(person4);

        Set<String> leadersHashSet = new HashSet<String>(Arrays.asList("Сталин", "Ленин", "Че Гевара"));
        Set<String> leadersLinkedHashSet = new LinkedHashSet<String>(Arrays.asList("Сталин", "Ленин", "Че Гевара"));
        Set<String> leadersTreeSet = new HashSet<String>(Arrays.asList("Сталин", "Ленин", "Че Гевара"));

        out.println("Leaders = " + leadersHashSet);
        out.println("Leaders = " + leadersLinkedHashSet);
        out.println("Leaders = " + leadersTreeSet);

    }

}