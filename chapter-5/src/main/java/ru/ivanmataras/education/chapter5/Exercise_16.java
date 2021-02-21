package ru.ivanmataras.education.chapter5;

import java.util.Arrays;
import java.util.UUID;

import static java.lang.System.out;

public class Exercise_16 {

    String[] stringArray = new String[10];

    Exercise_16() {

    }

    void fillArrayOfStringsWithLoop() {
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = generateRandomString();
        }
    }

    void printArrayOfStrings() {
        out.println(Arrays.toString(stringArray));
    }

    void fillArrayOfStringsWithNullValues() {
        Arrays.fill(stringArray, null);
    }

    String generateRandomString() {
        return UUID.randomUUID().toString();
    }

}