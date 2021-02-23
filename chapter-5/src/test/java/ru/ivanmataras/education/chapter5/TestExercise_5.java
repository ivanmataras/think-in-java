package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_5 {

   @Test
   @Order(1)
   void testExercise_5() {
      Exercise_5 exercise_5 = new Exercise_5();
      assertNotNull(exercise_5);
      exercise_5.printVariable(true);
      exercise_5.printVariable('a');
      exercise_5.printVariable((byte) 1);
      exercise_5.printVariable((short) 1);
      exercise_5.printVariable(1);
      exercise_5.printVariable((long) 1);
      exercise_5.printVariable((float) 1);
      exercise_5.printVariable((double) 1);
   }

}