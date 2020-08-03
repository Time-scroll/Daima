package my.hello.day1;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        int[] first = {10,5,7,2,3,6,8,12,15,20};
        int temp = 0;
        System.out.println("请输入你要查询的整数");
        int in = new Scanner(System.in).nextInt();
        for(int j = 0; j < first.length; j++) {
            for (int i = j + 1; i < first.length; i++) {
                if (first[j] > first[i]) {
                    temp = first[j];
                    first[j] = first[i];
                    first[i] = temp;

                }
            }

            if(first[j]==in){
                first[j]=first[j+1];
            }else {
                System.out.println(first[j]);
            }
        }
    }
}
