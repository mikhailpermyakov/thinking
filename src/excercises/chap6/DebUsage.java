package excercises.chap6;

import excercises.chap6.debug.DebugClass;
//static import excercises.chap6.debugoff.DebugClass;

public class DebUsage {
    private static DebugClass debg = new DebugClass();

    public static void main(String[] args) {
        debg.debug("");
    }

}
