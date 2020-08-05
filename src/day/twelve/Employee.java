package day.twelve;

import java.util.Scanner;

public class Employee extends Father{
    String sal = "FranklinYu";
    Scanner in1 = new Scanner(System.in);
    String emp_name = "李小龙";
    int emp_age = 22;
    int emp_sal = 30000;
    String emp_address = "America";

    @Override
    public String toString(){
        System.out.println("请输入姓名:");
        emp_name = in1.next();
        System.out.println("请输入年龄:");
        emp_age = in1.nextInt();
        System.out.println("请输入工资:");
        emp_sal = in1.nextInt();
        System.out.println("请输入地址:");
        emp_address = in1.next();
        System.out.println("姓名:"+emp_name+"年龄:"+emp_age+"工资:"+emp_sal+"地址:"+emp_address);
        return null;
    }

    public void showSal(String sal){
        System.out.println(sal);
        System.out.println(this.sal);
        System.out.println(super.sal);
    }

    public static void main(String[] args) {
        Employee in = new Employee();
        in.toString();
        in.showSal("忍者舞团");

    }
}

