package ru.ivanmataras.education.chapter15;

import java.util.Iterator;
import java.util.Random;

class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private static final Random random = new Random(47);
    private final Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    private int size = 0;

    CoffeeGenerator() {

    }

    CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].getDeclaredConstructor().newInstance();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

}