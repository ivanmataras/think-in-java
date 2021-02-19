package ru.ivanmataras.education.chapter5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.*;
import static java.lang.System.out;

public class Exercise_16 {

    String[] stringArray = new String[10];
    byte[] byteArray = new byte[7];
    Random random = new Random();

    Exercise_16() {

    }

    void fillArrayOfStringsWithLoop() {
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = generateRandomString();
        }
    }

    void fillArrayOfStringsWithForEach() {

    }

    void printArrayOfStrings() {
        out.println(Arrays.toString(stringArray));
    }

    void fillArrayOfStringsWithNullValues() {
        Arrays.fill(stringArray, null);
    }

    String generateRandomString() {
        random.nextBytes(byteArray);
        String generatedString = new String(byteArray, StandardCharsets.UTF_8);
        return generatedString;
    }

}