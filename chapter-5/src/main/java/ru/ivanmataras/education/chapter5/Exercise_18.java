package ru.ivanmataras.education.chapter5;

import java.util.Arrays;
import java.util.UUID;

import static java.lang.System.out;

 class Exercise_18 {

     Exercise_18[] exercise18Array = new Exercise_18[10];
     String stringField;

     Exercise_18() {

     }

     Exercise_18(String string) {
         stringField = string;
    }

    void fillArrayOfStringsWithLoop() {
        for (int i = 0; i < exercise18Array.length; i++) {
            exercise18Array[i] = new Exercise_18(generateRandomString());
        }
    }

    void printArrayOfStrings() {
        out.println(Arrays.toString(exercise18Array));
    }

    void fillArrayOfStringsWithNullValues() {
        Arrays.fill(exercise18Array, null);
    }

    static String generateRandomString() {
        return UUID.randomUUID().toString();
    }

}