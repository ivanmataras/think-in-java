package ru.ivanmataras.education.chapter3;

import static java.lang.System.out;

public class PrePostDemo {

    public static void main(String[] args) {
        int i = 3;
        i++;
        // prints 4
        out.println(i);
        ++i;
        // prints 5
        out.println(i);
        // prints 6
        out.println(++i);
        // prints 6
        out.println(i++);
        // prints 7
        out.println(i);
    }

}