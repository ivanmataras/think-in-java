package ru.ivanmataras.education.chapter5;

public enum Exercise_22 {

    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    String season;

    Exercise_22(String season) {
        this.season = season;
    }

    String getSeason() {
        return season;
    }

}