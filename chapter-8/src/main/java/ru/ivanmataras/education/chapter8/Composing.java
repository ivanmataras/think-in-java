package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Composing {

    private static long counter = 0;
    private final long id = counter++;
    private Shared shared;

    Composing(Shared shared) {
        out.println("Creating ".concat(String.valueOf(this)));
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        out.println("Disposing ".concat(String.valueOf(this)));
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing ".concat(String.valueOf(id));
    }

    @Override
    public void finalize() {
        out.println("In finalize method in Composing ".concat(String.valueOf(this)));
    }

}