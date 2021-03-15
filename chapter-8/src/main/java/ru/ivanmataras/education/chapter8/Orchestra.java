package ru.ivanmataras.education.chapter8;

class Orchestra {

    Orchestra() {

    }

    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

}