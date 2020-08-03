package my.hello.day1;

import java.util.Scanner;

public class Cg {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入1-100以内的整数：");
            int num = (int) (Math.random() * 100 + 1);
            while (true) {
                int result = in.nextInt();
                if (result < num) {
                    System.out.println("小了");
                } else if (result > num) {
                    System.out.println("大了");
                } else {
                    System.out.println("bingo");
                    break;
                }
            }
        }
}
