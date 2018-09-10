package excercises.chap9.fabr2;

public class DiceFactory implements ThrowableFact {
    @Override
    public Throwable getThrowable() {
        return new Die();
    }
}
