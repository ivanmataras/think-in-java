package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_6 {

   @Test
   @Order(1)
   void testExercise_6() {
      Exercise_6 exercise_6 = new Exercise_6();
      assertNotNull(exercise_6);
      exercise_6.printVariable(true);
      exercise_6.printVariable('a');
      exercise_6.printVariable((byte) 1);
      exercise_6.printVariable((short) 1);
      exercise_6.printVariable(1);
      exercise_6.printVariable((long) 1);
      exercise_6.printVariable((float) 1);
      exercise_6.printVariable((double) 1);
//        do not work
//        exercise_5.printVariable((byte) 1, (short) 1);
//        exercise_5.printVariable((short) 1, (byte) 1);
   }

}