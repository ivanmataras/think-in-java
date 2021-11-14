package ru.ivanmataras.education.chapter21;

class Toast {

    private final int id;
    private Status status = Status.DRY;

    Toast(int id) {
        this.id = id;
    }

    void butter() {
        status = Status.BUTTERED;
    }

    void jam() {
        status = Status.JAMMED;
    }

    Status getStatus() {
        return status;
    }

    int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Toast " + id + ": " + status;
    }

    enum Status {DRY, BUTTERED, JAMMED}

}