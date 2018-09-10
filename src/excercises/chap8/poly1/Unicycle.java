package excercises.chap8.poly1;

public class Unicycle extends Cycle {
    @Override
    public String toString() {
        return "Unicycle";
    }

    @Override
    public void ride() {
        System.out.println("now riding Unicycle");
    }

    public void balance() {
        System.out.println("trying to balance the unicycle");
    }
}
