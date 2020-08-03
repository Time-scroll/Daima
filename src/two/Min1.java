package two;

import java.util.Scanner;

public class Min1 {
    public static void main(String[] args) {
        System.out.println("请输入三个数字:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = a<b?a:b;
        int e = d<c?d:c;
        System.out.println("最小值为"+e);

    }
}
