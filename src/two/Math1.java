package two;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Y;
        int x = in.nextInt();
        if(x<=1){
        Y=x;
        System.out.println("Y的值为:"+Y);
        }else{
            if(1<x&&x<10){
                Y=3*x-2;
                System.out.println("Y的值为:"+Y);
            }else{
                if(x>=10){
                    Y=4*x;
                    System.out.println("Y的值为:"+Y);
                }
            }
        }
    }
}
