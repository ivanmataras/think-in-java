package ru.ivanmataras.education.chapter1;

import static java.lang.System.out;

public class EarlyAndLateBindingNewABC {

    static class A {
        public void foo() {
            out.println("Class A");
        }
    }

    static class B extends A {
        public void foo() {
            out.println("Class B");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ref = null;

        /*
            early binding  --- calls method foo() of class A and
            decided at compile time
        */
        a.foo();

        /* early binding --- calls method foo() of class B and
            decided at compile time
        */
        b.foo();

        /* late  binding --- --- calls method foo() of class B and
           decided at Run time
     */
        ref = b;
        ref.foo();
    }

}