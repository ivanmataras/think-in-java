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

        List<Person> personsArrayList = new ArrayList<Person>();
        personsArrayList.add(new Person(1, "Владимир", "Владимирович", "Путин", LocalDate.of(1952, 10, 7)));
        personsArrayList.add(new Person(2, "Борис", "Николаевич", "Ельцин", LocalDate.of(1931, 2, 1)));
        personsArrayList.add(new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2)));
        personsArrayList.add(new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2)));

        List<Person> personsLinkedList = new LinkedList<Person>();
        personsLinkedList.add(new Person(1, "Владимир", "Владимирович", "Путин", LocalDate.of(1952, 10, 7)));
        personsLinkedList.add(new Person(2, "Борис", "Николаевич", "Ельцин", LocalDate.of(1931, 2, 1)));
        personsLinkedList.add(new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2)));
        personsLinkedList.add(new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2)));

        Set<Person> personsHashSet = new HashSet<Person>();
        personsHashSet.add(new Person(1, "Владимир", "Владимирович", "Путин", LocalDate.of(1952, 10, 7)));
        personsHashSet.add(new Person(2, "Борис", "Николаевич", "Ельцин", LocalDate.of(1931, 2, 1)));
        personsHashSet.add(new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2)));
        personsHashSet.add(new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2)));

        Set<Person> personsLinkedHashSet = new LinkedHashSet<>();
        personsLinkedHashSet.add(new Person(1, "Владимир", "Владимирович", "Путин", LocalDate.of(1952, 10, 7)));
        personsLinkedHashSet.add(new Person(2, "Борис", "Николаевич", "Ельцин", LocalDate.of(1931, 2, 1)));
        personsLinkedHashSet.add(new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2)));
        personsLinkedHashSet.add(new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2)));

        Set<Person> personsTreeSet = new TreeSet<Person>();
        personsTreeSet.add(new Person(1, "Владимир", "Владимирович", "Путин", LocalDate.of(1952, 10, 7)));
        personsTreeSet.add(new Person(2, "Борис", "Николаевич", "Ельцин", LocalDate.of(1931, 2, 1)));
        personsTreeSet.add(new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2)));
        personsTreeSet.add(new Person(3, "Михаил", "Сергеевич", "Горбачёв", LocalDate.of(1931, 3, 2)));

        Set<String> leadersHashSet = new HashSet<String>(Arrays.asList("Сталин", "Ленин", "Че Гевара"));
        Set<String> leadersTreeSet = new HashSet<String>(Arrays.asList("Сталин", "Ленин", "Че Гевара"));
        out.println("Leaders = " + leadersHashSet);

    }

}