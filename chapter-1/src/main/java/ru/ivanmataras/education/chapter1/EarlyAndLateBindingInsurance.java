package ru.ivanmataras.education.chapter1;

import static java.lang.System.out;

public class EarlyAndLateBindingInsurance {

    public static void main(String[] args) {
// Пример статического и динамического связывания в Java
        Insurance current = new CarInsurance();
// Динамическое связывание на основе объекта
        int premium = current.premium();
// Статическое связывание на основе класса
        String category = current.category();
        out.println("premium : " + premium);
        out.println("category : " + category);
    }

}