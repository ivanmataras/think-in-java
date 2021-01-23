package ru.ivanmataras.education.chapter3;

import static java.lang.System.out;

public class AutoInc {

    public static void main(String[] args) {
        int i = 1;
        out.println("i : " + i);
        out.println("i : " + ++i);
        out.println("i : " + i++);
        out.println("i : " + i);
        out.println("i : " + --i);
        out.println("i : " + i--);
        out.println("i : " + i);

    }

}