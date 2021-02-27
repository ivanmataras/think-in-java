package ru.ivanmataras.education.chapter7;

class Exercise_1_1 {

    private Exercise_1_2 exercise_1_2;

    Exercise_1_1() {

    }

    void initializeExercise_1_2() {
        if (exercise_1_2 == null) {
            exercise_1_2 = new Exercise_1_2();
        }
    }

    Exercise_1_2 getExercise_1_2() {
        return exercise_1_2;
    }

    void setExercise_1_2(Exercise_1_2 exercise_1_2) {
        this.exercise_1_2 = exercise_1_2;
    }

}