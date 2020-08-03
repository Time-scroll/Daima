package two.student;

import java.util.Scanner;

/**
 * @author Fate
 * @date20200722
 * @desc评分系统
 *
 * 请输入成绩
 * double score
 * 成绩和我们的评分标准进行比对
 * 0-100
 *  90-100 S
 *  80-90  A
 *  70-80  B
 *  60-70  C
 *  <60    D
 * 不在1-100
 *         输入的成绩有误，请重新输入。
 */

public class student {
    public static void main(String[] args) {
        /*System.out.println("please input num1:");
        int num1=new Scanner(System.in).nextInt();
        System.out.println("please input num2:");
        int num2=new Scanner(System.in).nextInt();
        System.out.println("please input num2:");
        int num3=new Scanner(System.in).nextInt();
        int max=(num1 > num2)&& (num1 > num3)  ? num1 : ((num2 > num3) ? num2 : num3);
        System.out.println(max);*/
        System.out.println("请输入你的成绩:");
        double score = new Scanner(System.in).nextDouble();
        if(score>=0&&score<=100){
            if(score>=90) {
                System.out.println("你的成绩为优秀");
            }else{
                    if(score>=80) {
                        System.out.println("你的成绩为良好");
                    }else{
                        if(score>=70){
                            System.out.println("你的成绩为一般");
                        }else{
                            if(score>=60){
                                System.out.println("你的成绩为及格");
                            }else{
                                if(score<60){
                                    System.out.println("你的成绩为不及格");
                                }
                            }
                        }
                    }
            }
        }else{
            System.out.println("不在范围内，请重新输入。");
        }
        main(null);
    }
}