package ru.ivanmataras.education.chapter15;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static java.lang.System.out;

@TestMethodOrder(OrderAnnotation.class)
class TestCoffeeGenerator {

    @Test
    @Order(1)
    void testCoffeeGeneratorLoop() {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            out.println(coffeeGenerator.next());
        }
    }

    @Test
    @Order(2)
    void testCoffeeGeneratorIterator() {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (Coffee coffee : new CoffeeGenerator(5)) {
            out.println(coffee);
        }
    }

}