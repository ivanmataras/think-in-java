package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Hamster extends Rodent {

    Hamster() {

    }

    @Override
    void searchForFood() {
        out.println("Hamster is searching food");
    }

    @Override
    void eat() {
        out.println("Hamster is eating food");
    }

    @Override
    void sleep() {
        out.println("Hamster is sleeping");
    }

}