package ru.ivanmataras.education.chapter1;

class CarInsurance extends Insurance {

    static final int HIGH = 200;

    static String category() {
        return "Car Insurance";
    }

    @Override
    int premium() {
        return HIGH;
    }

}