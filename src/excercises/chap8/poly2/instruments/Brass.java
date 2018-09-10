package excercises.chap8.poly2.instruments;

public class Brass extends Instrument{
    @Override
    public void adjust() {
        System.out.println("this is a descendants' adjust!!\nadjusting " + this);
    }
}
