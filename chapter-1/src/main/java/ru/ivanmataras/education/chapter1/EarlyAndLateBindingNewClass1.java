package ru.ivanmataras.education.chapter1;

import static java.lang.System.out;

public class EarlyAndLateBindingNewClass1 {

    static class SuperClass {
        static void print() {
            out.println("Print in SuperClass.");
        }
    }

    static class SubClass extends SuperClass {
        static void print() {
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