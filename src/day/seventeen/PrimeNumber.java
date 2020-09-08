package day.seventeen;

import java.util.regex.Pattern;

/**
 * @author Fate
 * @date 2020/8/12
 */
public class PrimeNumber  {
    public static void main(String[] args) {
        One one1 = new One();
        Thread thread1 = new Thread(one1,"2~100000中一共有");
        thread1.start();
        Two two2 = new Two();
        Thread thread2 = new Thread(two2,"100000~200000中一共有");
        thread2.start();
        boolean b = Pattern.matches("a*b", "aaaaab");
        System.out.println("hahahaha"+b);


    }
}

class One implements Runnable {
    int n = 200000;
    int sum = 0;

    @Override
    public void run() {
        for(int i=100000;i<n;i++){
            if(i%2!=0){
                sum++;
            }
        }
        System.out.println(Thread.currentThread().getName()+sum+"个质数");
    }
}

class Two implements Runnable {
    int n = 100000;
    int sum = 0;
    @Override
    public void run() {
        for(int i=2;i<n;i++){
            if(i%2!=0){
                sum++;
            }
        }
        System.out.println(Thread.currentThread().getName()+sum+"个质数");
    }
}