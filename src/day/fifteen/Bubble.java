package day.fifteen;
import jdk.internal.instrumentation.Logger;

/**
 * @author Fate
 * @date 2020/9/7
 */
public class Bubble {
    static class T extends Thread {
        @Override
        public void run() {
            Logger log = null;
            log.info("我是继承Thread的任务");
        }
    }

    public static void main(String[] args) {
        T t = new T();
        t.start();
    }
}
