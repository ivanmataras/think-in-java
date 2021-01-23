package ru.ivanmataras.education.chapter5;

public class GarbageCollectorStringTest {

    public static void main(String[] args) {
        while (true) {
            createStringContainerObject();
        }
    }

    private static void createStringContainerObject() {
        String string = new String("test string");
        StringContainer stringContainer = new StringContainer();
        stringContainer.setStringContainerField(string);
    }
}