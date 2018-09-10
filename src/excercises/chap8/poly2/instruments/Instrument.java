package excercises.chap8.poly2.instruments;

import excercises.chap8.poly2.Note;

public class Instrument {
    public void play(Note n){
        System.out.println("now playing note " + n);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public void adjust(){
        System.out.println("adjusting " + this);
    }
}
