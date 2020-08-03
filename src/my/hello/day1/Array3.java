package my.hello.day1;

import java.util.Scanner;

public class Array3<array> {
    //求数组中的最大值，并将最大值放到数组数据的第一位。
;
    public static void main(String[] args) {
        System.out.println("请输入数值:");
        int[] array = new int[10];
        int one = array[0];
        for(int i=0;i<array.length;i++){
            System.out.println("请输入第"+(i+1)+"个数"+":");
            array[i] = new Scanner(System.in).nextInt();
            if(array[i]>one){
                one = array[i];
            }
        }
        array[0]=one;
        System.out.println("数组的第一位为:"+array[0]);
    }
}
