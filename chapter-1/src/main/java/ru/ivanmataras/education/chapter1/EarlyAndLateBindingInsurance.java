package ru.ivanmataras.education.chapter1;

public class EarlyAndLateBindingInsurance {

    public static void main(String[] args) {
// Пример статического и динамического связывания в Java
        Insurance current = new CarInsurance();
// Динамическое связывание на основе объекта
        int premium = current.premium();
// Статическое связывание на основе класса
        String category = current.category();
        System.out.println("premium : " + premium);
        System.out.println("category : " + category);
    }

}