package ru.ivanmataras.education.chapter1;

import static java.lang.System.out;

public class EarlyAndLateBindingNewClass2 {

    static class SuperClass {
        void print() {
            out.println("Print in SuperClass.");
        }
    }

    static class SubClass extends SuperClass {
        @Override
        void print() {
            out.println("Print in SubClass.");
        }
    }

    public static void main(String[] args) {
        SuperClass instance1 = new SuperClass();
        SuperClass instance2 = new SubClass();
        instance1.print();
        instance2.print();
    }

}