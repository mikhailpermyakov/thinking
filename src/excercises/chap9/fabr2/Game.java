package excercises.chap9.fabr2;

public class Game {
    public static void play(ThrowableFact tf){
        Throwable item = tf.getThrowable();

        item.doThrow();
    }

    public static void main(String[] args) {
        int i = 0;
        do {
            play(new CoinFact());
            play(new DiceFactory());
            System.out.println();
        } while (i++ < 100);
    }
}
