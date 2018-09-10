package excercises.chap9.fabr;

public class Cycles {
    public static void cycleConsumer(CycleFactory cf){
        Cycle cycle = cf.getCycle();

        cycle.cycleMeth1();
        cycle.cycleMeth2();
    }
    public static void main(String[] args) {
        cycleConsumer(new UnicycleFactory());
        cycleConsumer(new BicycleFactory());
        cycleConsumer(new TricycleFactory());
    }
}
