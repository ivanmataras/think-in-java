package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class AlertStatusOff extends AlertStatus {

    AlertStatusOff() {

    }

    void alert() {
        out.println("AlertStatus Off");
    }

}