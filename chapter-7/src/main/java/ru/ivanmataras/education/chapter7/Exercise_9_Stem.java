package ru.ivanmataras.education.chapter7;

import static java.lang.System.out;

class Exercise_9_Stem extends Exercise_9_Root {

    private final Exercise_9_Component_1 exercise_9_component_1 = new Exercise_9_Component_1();
    private final Exercise_9_Component_2 exercise_9_component_2 = new Exercise_9_Component_2();
    private final Exercise_9_Component_3 exercise_9_component_3 = new Exercise_9_Component_3();

    Exercise_9_Stem() {
        out.println("In Exercise_9_Stem constructor");
    }

}