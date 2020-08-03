package two;

public class Xiancheng<or> extends Thread{
    public void run(){
        //run方法线程体
        for (int i = 0; i <=20; i++) {
            System.out.println("我在学习多线程---"+i);
        }
    }

    public static void main(String[] args) {
        //主线程
        Xiancheng a = new Xiancheng();
        //创建一个线程对象
        a.start();
        //调用start方法开启线程
        for (int i = 0; i < 200; i++) {
            System.out.println("我在敲代码---"+i);
        }
    }
}
