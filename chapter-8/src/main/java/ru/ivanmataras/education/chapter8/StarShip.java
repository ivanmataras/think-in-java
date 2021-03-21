package ru.ivanmataras.education.chapter8;

class StarShip {

    private AlertStatus alertStatus = new AlertStatusOn();

    StarShip() {

    }

    void change() {
        alertStatus = new AlertStatusOff();
    }

    void performAlert() {
        alertStatus.alert();
    }

}