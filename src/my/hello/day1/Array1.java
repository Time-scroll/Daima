package my.hello.day1;

import java.util.Scanner;

public class Array1 {
    //求数组中的最大值

    public static void main(String[] args) {
        System.out.println("请输入数值:");
        int[] array = new int[10];
        int one = array[0];
        for(int i=0;i<array.length;i++){
           array[i] = new Scanner(System.in).nextInt();
            if(array[i]>one){
                one = array[i];
            }
        }
        System.out.println("数组中的最大值为:"+one);

    }
}
