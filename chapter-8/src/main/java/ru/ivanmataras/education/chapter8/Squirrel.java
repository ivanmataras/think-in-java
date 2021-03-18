package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Squirrel extends Rodent {

    Squirrel() {
        out.println("Call Squirrel constructor");
    }

    @Override
    void searchForFood() {
        out.println("Squirrel is searching food");
    }

    @Override
    void eat() {
        out.println("Squirrel is eating food");
    }

    @Override
    void sleep() {
        out.println("Squirrel is sleeping");
    }

}