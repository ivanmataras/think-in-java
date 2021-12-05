package ru.ivanmataras.education.chapter17;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.*;
import java.util.stream.Stream;

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

}