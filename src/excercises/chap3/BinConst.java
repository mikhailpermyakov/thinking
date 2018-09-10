package excercises.chap3;

public class BinConst {

    public static void main(String[] args) {
//        final int c1 = 0x55;
//        final int c2 = 0xd4;
//        final int c3 = 0x1;
//        final int c4 = 0x2;
//        final int c5 = 0;
        final int c6 = 1;
        final long c7 = 1L;

//        System.out.println("c1 = 0" + Integer.toBinaryString(c1));
//        System.out.println("c2 = " + Integer.toBinaryString(c2));
//
//        System.out.println("c1&c2 = " + Integer.toBinaryString(c1&c2));
//        System.out.println("c1|c2 = " + Integer.toBinaryString(c1|c2));
//        System.out.println("c1^c2 = " + Integer.toBinaryString(c1^c2));
//        System.out.println("~c1 = " + Integer.toBinaryString(~c1));
//        System.out.println("~c2 = " + Integer.toBinaryString(~c2));
//
//        System.out.println("~c3 = " + Integer.toBinaryString(~c3) + " = " + ~c3);
//        System.out.println("~c4 = " + Integer.toBinaryString(~c4) + " = " + ~c4);
//
//        System.out.println("~c5 = " + Integer.toBinaryString(~c5) + " = " + ~c5);
//
//        System.out.println("MaxInt = " + Integer.toBinaryString(Integer.MAX_VALUE) + " = " + Integer.MAX_VALUE);
//        System.out.println("~MaxInt = " + Integer.toBinaryString(~Integer.MAX_VALUE) + " = " + ~Integer.MAX_VALUE);

        for (int i = 0; i < 6; i++) {
            System.out.println("c6: "+c6+">>" + i + " = " + (c6>>>i));
            System.out.println("c7: "+c7+">>" + i + " = " + (c7>>>i));

            System.out.println("c6: "+c6+"<<" + i + " = " + (c6<<i));
            System.out.println("c7: "+c7+"<<" + i + " = " + (c7<<i));
        }
    }
}
