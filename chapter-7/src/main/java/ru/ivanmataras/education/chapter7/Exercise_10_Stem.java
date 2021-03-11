package ru.ivanmataras.education.chapter7;

import static java.lang.System.out;

class Exercise_10_Stem extends Exercise_10_Root {

    Exercise_10_Component_1 exercise_10_component_1 = new Exercise_10_Component_1("In Exercise_10_Component_1 constructor");
    Exercise_10_Component_2 exercise_10_component_2 = new Exercise_10_Component_2("In Exercise_10_Component_2 constructor");
    Exercise_10_Component_3 exercise_10_component_3 = new Exercise_10_Component_3("In Exercise_10_Component_3 constructor");

    Exercise_10_Stem(String message) {
        super("Call Exercise_10_Root from Exercise_10_Stem with parameter ".concat(message));
        out.println(message);
    }

}