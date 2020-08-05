package day.twelve;

import java.util.Scanner;

public class Student {
    Scanner in = new Scanner(System.in);

    public Student() {
        System.out.println("请输入学生的学号:");
        int student_ID = in.nextInt();
        System.out.println("请输入学生的班级:");
        String Class = in.next();
        System.out.println("请输入学生的姓名:");
        String Name = in.next();
        System.out.println("请输入学生的年龄:");
        int age = in.nextInt();
        for(int a=1;a>0;a++){
            if(age>1&&age<100){
                break;
            }else{
                System.out.println("请重新输入:");
            }
        }
        System.out.println("请输入学生的性别:");
        String Gender = in.next();

        for(int i=1;i>0;i++){
            if("男".equals(Gender)||"女".equals(Gender)){
                break;
            }else{
                System.out.println("请重新输入");
                Gender = in.next();
            }
        }
        System.out.println("学号  班级  姓名  年龄  性别");
        System.out.println(student_ID+"  "+Class+"  "+Name+"  "+age+"    "+Gender);
    }


    public static void main(String[] args) {
        new Student();



    }


}


