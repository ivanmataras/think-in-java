package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_5 {

    @Test
    @Order(1)
    void testExercise_5() {
        Exercise_5 exercise_5 = new Exercise_5();
        assertNotNull(exercise_5);

        //cant access class field, because method access is private
        //String privateStringField = exercise_5.privateStringField;
        String packageStringField = exercise_5.packageStringField;
        String protectedStringField = exercise_5.protectedStringField;
        String publicStringField = exercise_5.publicStringField;

        //assertNull(privateStringField);
        assertNull(packageStringField);
        assertNull(protectedStringField);
        assertNull(publicStringField);

        //cant access class method, because method access is private
        //privateStringField = exercise_5.getPrivateStringField();
        packageStringField = exercise_5.getPackageStringField();
        protectedStringField = exercise_5.getProtectedStringField();
        publicStringField = exercise_5.getPublicStringField();

        //assertNull(privateStringField);
        assertNull(packageStringField);
        assertNull(protectedStringField);
        assertNull(publicStringField);

        //cant access class method, because method access is private
        //exercise_5.setPrivateStringField(new String("privateStringField"));
        exercise_5.setPackageStringField("packageStringField");
        exercise_5.setProtectedStringField("protectedStringField");
        exercise_5.setPublicStringField("publicStringField");

        //assertNotNull(exercise_5.getPrivateStringField());
        assertNotNull(exercise_5.getPackageStringField());
        assertNotNull(exercise_5.getProtectedStringField());
        assertNotNull(exercise_5.getPublicStringField());
    }

}