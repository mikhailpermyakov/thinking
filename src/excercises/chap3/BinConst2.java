package excercises.chap3;

public class BinConst2 {
    public static void main(String[] args) {
        long c1 = 0x8000;
        long c2 = 0Xffff;

        for (int i = 0; i < 16; i++) {
            System.out.println(c1 + " : " + Long.toBinaryString(c1));
            c1>>=1;
        }

//        System.out.println(c2 + " : " + Long.toBinaryString(c2));
//        c2<<=1;
        System.out.println(c2 + " : " + Long.toBinaryString(c2));

        for (int i = 1; i <= 16; i++) {
            System.out.println(c2 + " : " + Long.toBinaryString(c2));
            c2>>>=1;
        }
    }
}
