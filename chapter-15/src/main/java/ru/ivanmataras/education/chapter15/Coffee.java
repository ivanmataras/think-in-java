package ru.ivanmataras.education.chapter15;

class Coffee {

    private static int counter = 0;
    private static final int id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }

}