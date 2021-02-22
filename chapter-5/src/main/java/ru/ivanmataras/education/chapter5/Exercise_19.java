package ru.ivanmataras.education.chapter5;

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