package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Rodent {

    Rodent() {
        out.println("Call Rodent constructor");
    }

    void searchForFood() {
        out.println("Rodent is searching food");
    }

    void eat() {
        out.println("Rodent is eating food");
    }

    void sleep() {
        out.println("Rodent is sleeping");
    }

}