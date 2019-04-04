package mateusz.inheritance.instruments;

public class InstrumentMain {

    public static void main(String[] args) {
        Instrument guitar = new Guitar();

        Trumpet trumpet = new Trumpet();

        Instrument[] instruments = {guitar, trumpet};

        for (Instrument instrument : instruments) {
            instrument.getSound();
        }
    }
}

