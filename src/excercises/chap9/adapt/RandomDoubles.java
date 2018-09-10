package excercises.chap9.adapt;

import java.util.Random;

class RandomDoubles {
    private static Random rand = new Random(47);
    double next(){
        return rand.nextDouble();
    }

//    public static void main(String[] args) {
//        RandomDoubles rd = new RandomDoubles();
//        for (int i = 0; i < 7; i++) {
//            System.out.println(rd.next() + " ");
//        }
//    }
}
