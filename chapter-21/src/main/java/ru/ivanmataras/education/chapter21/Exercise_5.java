package ru.ivanmataras.education.chapter21;

import java.util.concurrent.Callable;

class Exercise_5 implements Callable<Integer> {

    private int number;

    Exercise_5(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int fibonacciNumber = generateFibonacciNumber(number);
        return fibonacciNumber;
    }

    private int generateFibonacciNumber(int number) {
        if (number < 2) {
            return 1;
        }
        return generateFibonacciNumber(number - 2) + generateFibonacciNumber(number - 1);
    }

}