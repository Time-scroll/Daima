package day.seventeen;

/**
 * @author Fate
 * @date 2020/8/12
 */
public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("兔子");
        Tortoise tortoise = new Tortoise("乌龟");
        rabbit.start();
        tortoise.start();
    }
}

class Rabbit extends Thread {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 10; i <= 100; i += 10) {
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "米");
            if (i == 50) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 100) {
                    System.out.println("兔子Wined");
                    System.exit(0);
                }
            }
        }
    }
}


class Tortoise extends Thread {
    public Tortoise(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 5; i <= 100; i += 5) {
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "米");
            if (i == 100) {
                System.out.println("乌龟Wined");
                System.exit(0);
            }
        }
    }
}
