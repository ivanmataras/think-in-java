package ru.ivanmataras.education.chapter5;

import java.util.Arrays;
import java.util.UUID;

import static java.lang.System.out;

class Exercise_17 {

    Exercise_18[] exercise18Array = new Exercise_18[10];
    String stringField;

    Exercise_17() {

    }

    Exercise_17(String string) {

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

    String generateRandomString() {
        return UUID.randomUUID().toString();
    }

}