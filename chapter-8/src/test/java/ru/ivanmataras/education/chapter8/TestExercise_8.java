package ru.ivanmataras.education.chapter8;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_8 {

    @Test
    @Order(1)
    void testExercise_8() {

        RandomInstrumentGenerator randomInstrumentGenerator = new RandomInstrumentGenerator();
        assertNotNull(randomInstrumentGenerator);

        Instrument[] instruments = new Instrument[9];

        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = randomInstrumentGenerator.next();
        }

        for (Instrument instrument : instruments) {
            String instrumentName = instrument.what();
            out.println("Instrument name : ".concat(instrumentName));
            instrument.adjust();
            instrument.play(Note.MIDDLE_C);
        }

    }

}