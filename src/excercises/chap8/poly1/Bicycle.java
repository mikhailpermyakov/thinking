package excercises.chap8.poly1;

public class Bicycle extends Cycle {
    @Override
    public void ride(){
        System.out.println("now riding Bicycle");
    }

    public void balance() {
        System.out.println("trying to balance the bicycle");
    }

    @Override
    public String toString() {
        return "Bicycle";
    }
}
