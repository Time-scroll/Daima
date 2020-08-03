package two;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        //从键盘接收数值，并赋值给变量a,Operator,b，其中Operator为运算符。
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个数值:");
        int a = in.nextInt();
        System.out.println("请输入运算符:");
        String Operator = in.next();
        System.out.println("请输入第二个数值:");
        int b = in.nextInt();
        // switch判断
        switch(Operator){
            case "+":
                System.out.println("和为:"+(a+b));
                break;
            case "-":
                System.out.println("差为:"+(a-b));
                break;
            case "*":
                System.out.println("积为:"+(a*b));
                break;
            case "/":
                if(b==0){
                    System.out.println("值不能为空");
                }else{
                    System.out.println("商为:"+(a/b));
                    break;
                }
            default:
                System.out.println("输入错误，请重新输入");
        }
    }
}





// 使用变量名.equals("字符串") 判断输入的运算符是否相等，如果相等，打印对应的运算结果。
       /* if(Operator.equals("+")){
            System.out.println("和为:"+(a+b));

        }else if(Operator.equals("-")){
            System.out.println("差为:"+(a-b));

        }else if(Operator.equals("*")){
            System.out.println("积为:"+(a*b));

        }else if(Operator.equals("/")){
            System.out.println("商为:"+(a/b));
        }
    }
}*/