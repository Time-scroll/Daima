package day.fifteen;

/**
 * @author Fate
 * @date 2020/8/10
 */
public class Runtime {
    private static Runtime currentRuntime = Runtime.getRuntime();

    public static Runtime getRuntime() {
        return currentRuntime;
    }

    private Runtime() {
    }
}

