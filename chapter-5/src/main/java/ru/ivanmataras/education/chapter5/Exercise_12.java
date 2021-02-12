package ru.ivanmataras.education.chapter5;

import static java.lang.System.out;

public class Exercise_12 {

    boolean checkedOut = false;

    Exercise_12(boolean checkOut) {
        checkedOut = checkOut;
    }

    void chekIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut) {
            out.println("Error: checkedOut");
        }
        out.println("In finalize method");
    }

}