package ru.ivanmataras.education.chapter7;

class Exercise_18 {

    static final int STATIC_FINAL_INT_FIELD = 10;
    static final String STATIC_FINAL_STRING_FIELD = new String("STATIC_FINAL_STRING_FIELD");
    final int intFinalField;
    final String finalStringField;

    Exercise_18(int intFinalField, String finalStringField) {
        this.intFinalField = intFinalField;
        this.finalStringField = finalStringField;
    }


}