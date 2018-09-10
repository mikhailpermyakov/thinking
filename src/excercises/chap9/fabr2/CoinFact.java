package excercises.chap9.fabr2;

public class CoinFact implements ThrowableFact {
    @Override
    public Throwable getThrowable() {
        return new Coin();
    }
}
