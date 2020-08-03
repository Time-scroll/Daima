package two;

import java.util.Scanner;

public class person {
        public static void main(String[] args) {
            System.out.println("please input num1:");
            int num1=new Scanner(System.in).nextInt();
            System.out.println("please input num2:");
            int num2=new Scanner(System.in).nextInt();
            System.out.println("please input num2:");
            int num3=new Scanner(System.in).nextInt();
            int max=(num1 > num2)&& (num1 > num3)  ? num1 : ((num2 > num3) ? num2 : num3);
        }
    }


