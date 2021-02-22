package ru.ivanmataras.education.chapter5;

enum Exercise_21 {

    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    String season;

    Exercise_21(String season) {
        this.season = season;
    }

    String getSeason() {
        return season;
    }

}