package excercises.chap6.debug;

public class DebugClass {
    String arg = "debug";

    public void debug(String arg){
        arg = this.arg;
        System.out.println(arg);
    }
}
