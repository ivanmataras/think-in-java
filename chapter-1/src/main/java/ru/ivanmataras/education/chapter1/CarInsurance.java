package ru.ivanmataras.education.chapter1;

public class CarInsurance extends Insurance {

    public static final int HIGH = 200;

    public int premium() {
        return HIGH;
    }

    public static String category() {
        return "Car Insurance";
    }
}