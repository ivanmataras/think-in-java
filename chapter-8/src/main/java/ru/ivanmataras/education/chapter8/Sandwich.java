package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Sandwich extends PortableLunch {

    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    private Pickle pickle = new Pickle();

    Sandwich() {
        out.println("Sandwich()");
    }

}