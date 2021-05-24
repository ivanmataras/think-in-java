package ru.ivanmataras.education.chapter21;

import static java.lang.System.out;

class Exercise_2 implements Runnable {

    private int number;

    Exercise_2(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int fibonacciNumber = generateFibonacciNumber(number);
        out.println(fibonacciNumber);
    }

    private int generateFibonacciNumber(int number) {
        if (number < 2) {
            return 1;
        }
        return generateFibonacciNumber(number - 2) + generateFibonacciNumber(number - 1);
    }


}