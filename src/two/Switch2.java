package two;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        System.out.println("请输入月份:");
        int month = new Scanner(System.in).nextInt();
        switch(month){
            case 1:
            case 2:
            case 3:
                System.out.println("当前为第一季度");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("当前为第二季度");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("当前为第三季度");
            case 10:
            case 11:
            case 12:
                System.out.println("当前为第四季度");
                break;
            default:
                System.out.println("对不起，您的输入有误，请重新输入。");
                break;
        }
    }
}
