package ru.ivanmataras.education.chapter4;

import static java.lang.System.out;

public class CommaOperator {

    public static void main(String[] args) {
        for (int a = 0, b = 9; a < 10; a++, b--) {
            out.println(a + " " + b);
        }
    }

}