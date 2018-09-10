package excercises.chap8.poly2;

import excercises.chap8.poly2.instruments.Instrument;

import java.util.Random;

public class JazzMusician implements Musician {
    private Instrument[] instruments;
    private Instrument currentInstrument;

    JazzMusician(Instrument[] instruments) {
        this.instruments = instruments;
    }


    @Override
    public Instrument pickInstrument() {
        if (instruments.length == 0){
            System.out.println("no instruments available");
            return null;
        }
        currentInstrument = instruments[new Random().nextInt(instruments.length)];
        System.out.println("picked " + currentInstrument + " as a main instrument");
        return currentInstrument;
    }

    @Override
    public boolean play(Note note) {
        if (currentInstrument == null){
            System.out.println("pick an instrument first");
            return false;
        }
        currentInstrument.play(note);

        return true;
    }

    @Override
    public boolean adjustInstrument() {
        if (currentInstrument == null){
            System.out.println("pick an instrument first");
            return false;
        }
        currentInstrument.adjust();
        return true;
    }

}
