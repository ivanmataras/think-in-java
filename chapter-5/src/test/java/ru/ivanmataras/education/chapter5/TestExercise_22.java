package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static java.lang.System.out;
import static ru.ivanmataras.education.chapter5.Exercise_22.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExercise_22 {

    @Test
    @Order(1)
    public void testExercise_22() {
        Exercise_22 season = Exercise_22.WINTER;
        switch (season) {
            case WINTER -> out.println(WINTER.getSeason());
            case SPRING -> out.println(SPRING.getSeason());
            case SUMMER -> out.println(SUMMER.getSeason());
            case AUTUMN -> out.println(AUTUMN.getSeason());
        }
    }

}