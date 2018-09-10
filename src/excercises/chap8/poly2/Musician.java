package excercises.chap8.poly2;

import excercises.chap8.poly2.instruments.Instrument;

public interface Musician {
    Instrument pickInstrument();
    boolean play(Note note);
    boolean adjustInstrument();
}
