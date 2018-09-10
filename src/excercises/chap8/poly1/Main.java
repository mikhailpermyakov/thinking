package excercises.chap8.poly1;

public class Main {
    public static void main(String[] args)throws Exception {
        Cyclist cyclist = new Cyclist();
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};
        Cycle c = new Tricycle();

        for (Cycle cycle : cycles){
            cyclist.ride(cycle);
//            cycle.balance();
        }

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Tricycle)cycles[2]).toString();
    }
}
