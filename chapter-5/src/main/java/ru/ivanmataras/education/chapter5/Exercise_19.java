package ru.ivanmataras.education.chapter5;

import java.util.Arrays;
import java.util.UUID;

import static java.lang.System.out;

 class Exercise_19 {

     Exercise_19() {

     }

     void printVariableArguments(String... arguments) {
         for (String argument : arguments) {
             out.println(argument);
         }
     }

}