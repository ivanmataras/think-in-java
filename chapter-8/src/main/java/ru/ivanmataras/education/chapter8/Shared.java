package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Shared {

    private static long counter = 0;
    private final long id = counter++;
    private int refcount = 0;

    Shared() {
        out.println("Creating ".concat(String.valueOf(this)));
    }

    void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            out.println("Disposing ".concat(String.valueOf(this)));
        }
    }

    @Override
    public String toString() {
        return "Shared ".concat(String.valueOf(id));
    }

    @Override
    public void finalize() {
        out.println("In finalize method in Shared ".concat(String.valueOf(this)));
    }

}