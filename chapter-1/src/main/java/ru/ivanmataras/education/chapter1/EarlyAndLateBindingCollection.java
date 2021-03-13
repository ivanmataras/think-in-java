package ru.ivanmataras.education.chapter1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class EarlyAndLateBindingCollection {

    public static void print(Collection collection) {
        out.println("Collection");
    }

    public static void print(Set set) {
        out.println("Set");
    }

    public static void print(HashSet hashSet) {
        out.println("HashSet");
    }

}