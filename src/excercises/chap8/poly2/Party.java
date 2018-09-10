package excercises.chap8.poly2;

import excercises.chap8.poly2.instruments.*;

public class Party {
    public static void main(String[] args) {
        Instrument[] instruments = {new Wind(), new Percussion(), new Stringer(), new Woodwind(), new Brass()};
        Musician musician = new JazzMusician(instruments);
        Note[] notes = {Note.C, Note.A, Note.D, Note.E, Note.F, Note.G, Note.H};
        if (musician.pickInstrument() != null)
            System.out.println("cannot pick an instrument");
        if (!musician.adjustInstrument())
            System.out.println("adjustment failed for some reason");

        for (Note note : notes)
            if (musician.play(note)){
                System.out.println("it's ok, keep playing");
            }
    }
}
