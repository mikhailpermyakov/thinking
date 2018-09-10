package excercises.chap9.interf2;

public class Heir extends Base implements IntHeir{
    @Override
    public void methHeir() {

    }

    @Override
    public void meth11() {

    }

    @Override
    public void meth12() {

    }

    @Override
    public void meth21() {

    }

    @Override
    public void meth22() {

    }

    @Override
    public void meth31() {

    }

    @Override
    public void meth32() {

    }

    private static void meth1(Int1 arg){}
    private static void meth2(Int2 arg){}
    private static void meth3(Int3 arg){}
    private static void meth4(IntHeir arg){}

    public static void main(String[] args) {
        Heir heir = new Heir();

        meth1(heir);
        meth2(heir);
        meth3(heir);
        meth4(heir);
    }
}
