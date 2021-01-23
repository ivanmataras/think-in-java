package ru.ivanmataras.education.chapter1;

public class EarlyAndLateBindingNewClass2 {

    public static class SuperClass {
        void print() {
            System.out.println("Print in SuperClass.");
        }
    }

    public static class SubClass extends SuperClass {
        @Override
        void print() {
            System.out.println("Print in SubClass.");
        }
    }

    public static void main(String[] args) {
        SuperClass instance1 = new SuperClass();
        SuperClass instance2 = new SubClass();
        instance1.print();
        instance2.print();
    }

}