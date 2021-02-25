package ru.ivanmataras.education.chapter6;

class Exercise_6 {

    Exercise_6_1 exercise_6_1 = new Exercise_6_1();

    Exercise_6() {

    }

    String getExercise_6_1_StringField() {
        return exercise_6_1.getStringField();
    }

    void setExercise_6_1_StringField(String stringFieldValue) {
        exercise_6_1.setStringField(stringFieldValue);
    }

}

class Exercise_6_1 {

    protected String stringField;

    Exercise_6_1() {

    }

    protected String getStringField() {
        return stringField;
    }

    protected void setStringField(String stringField) {
        this.stringField = stringField;
    }

}