package ru.ivanmataras.education.chapter1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EarlyAndLateBindingCollection {

    public static void main(String[] args) {
        Collection collection = new HashSet();
        print(collection);
    }

    public static void print(Collection collection) {
        System.out.println("Collection");
    }

    public static void print(Set set) {
        System.out.println("Set");
    }

    public static void print(HashSet hashSet) {
        System.out.println("HashSet");
    }
}