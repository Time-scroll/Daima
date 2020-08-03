package my.hello.day1;
import java.util.Scanner;
public class demo05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数字。");
        int a = in.nextInt();
        System.out.println("请输入一个数字。");
        int b = in.nextInt();
        System.out.println("请输入一个数字。");
        int c = in.nextInt();
        int temp = a==b ? a : b;
        int d= temp==c ? temp:c;
        System.out.println("最大值为："+d);
    }
}
