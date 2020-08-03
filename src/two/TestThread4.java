package two;

public class TestThread4 implements Runnable{
    private int tick = 10;

    public void run(){
        while (true){
            if (tick <= 0) {
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+tick--+"票");


    }
}

    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();
        Thread a = new Thread(testThread4,"弟弟");
        new Thread(testThread4,"小明").start();
        new Thread(testThread4,"小红").start();
        new Thread(testThread4,"黄牛党").start();
        a.start();
}
}
