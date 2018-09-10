package excercises.chap9.fabr2;

import java.util.Random;

import static java.lang.Math.abs;

public class Die implements Throwable {
    @Override
    public void doThrow() {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println("" + (abs(i % 6) + 1));
    }
}
