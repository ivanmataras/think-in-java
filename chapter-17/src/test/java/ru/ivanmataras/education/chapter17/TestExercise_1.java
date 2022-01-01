package ru.ivanmataras.education.chapter17;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
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
    void testExercise_1() {

        List<Integer> arrayListOfInteger = Stream.iterate(1, n -> n + 1).limit(10).collect(toCollection(ArrayList::new));
        List<Integer> linkedListOfInteger = Stream.iterate(1, n -> n + 1).limit(10).collect(toCollection(LinkedList::new));

        Set<Integer> hashSetOfInteger = Stream.iterate(1, n -> n + 1).limit(10).collect(toCollection(HashSet::new));
        Set<Integer> treeSetOfInteger = Stream.iterate(1, n -> n + 1).limit(10).collect(toCollection(TreeSet::new));
        Set<Integer> linkedHashSetOfInteger = Stream.iterate(1, n -> n + 1).limit(10).collect(toCollection(LinkedHashSet::new));

    }

    @Test
    void testFillCollectionsWithPersonsObjects() {

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

        Set<Person> personsLinkedHashSet = new LinkedHashSet<Person>();
        personsLinkedHashSet.add(person1);
        personsLinkedHashSet.add(person2);
        personsLinkedHashSet.add(person3);
        personsLinkedHashSet.add(person4);

        Set<Person> personsTreeSet = new TreeSet<Person>();
        personsTreeSet.add(person1);
        personsTreeSet.add(person2);
        personsTreeSet.add(person3);
        personsTreeSet.add(person4);

    }

    @Test
    void testFillCollectionsWithIntegerType() {

        List<Integer> integersList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Set<Integer> integersHashSet = new HashSet<Integer>(integersList);
        Set<Integer> integersLinkedHashSet = new LinkedHashSet<Integer>(integersList);
        Set<Integer> integersTreeSet = new TreeSet<Integer>(integersList);

        out.println("integersHashSet = " + integersHashSet);
        out.println("integersLinkedHashSet = " + integersLinkedHashSet);
        out.println("integersTreeSet = " + integersTreeSet);

    }

    @Test
    void testFillCollectionsWithCharacterType() {

        Character[] englishAlphabetUpperCase = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        List<Character> charactersList = Arrays.asList(englishAlphabetUpperCase);

        Set<Character> charactersHashSet = new HashSet<Character>(charactersList);
        Set<Character> charactersLinkedHashSet = new LinkedHashSet<Character>(charactersList);
        Set<Character> charactersTreeSet = new TreeSet<Character>(charactersList);

        out.println("charactersHashSet = " + charactersHashSet);
        out.println("charactersLinkedHashSet = " + charactersLinkedHashSet);
        out.println("charactersTreeSet = " + charactersTreeSet);

    }

    @Test
    void testFillCollectionsWithLeadersString() {

        List<String> leadersList = Arrays.asList("Сталин", "Ленин", "Че Гевара");

        Set<String> leadersHashSet = new HashSet<String>(leadersList);
        Set<String> leadersLinkedHashSet = new LinkedHashSet<String>(leadersList);
        Set<String> leadersTreeSet = new TreeSet<String>(leadersList);

        out.println("leadersHashSet = " + leadersHashSet);
        out.println("leadersLinkedHashSet = " + leadersLinkedHashSet);
        out.println("leadersTreeSet = " + leadersTreeSet);

    }

}