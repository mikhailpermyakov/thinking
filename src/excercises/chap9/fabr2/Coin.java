package excercises.chap9.fabr2;

import java.util.Random;

public class Coin implements Throwable {
    @Override
    public void doThrow() {
        Random random = new Random();
        String side = (random.nextInt() % 2 == 0) ? "heads" : "tails";
        System.out.println(side);
    }
}
