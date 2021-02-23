package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static java.lang.System.gc;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_12 {

   @Test
   @Order(1)
   void testExercise_12() {
      Exercise_12 exercise_12 = new Exercise_12(true);
      assertNotNull(exercise_12);
      exercise_12.chekIn();
      exercise_12 = null;
      assertNull(exercise_12);
      gc();
   }

}