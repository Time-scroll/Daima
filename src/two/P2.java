package two;

public class P2 {
    public static void main(String[] args) {
        int a = 1;
        while(a<=9){                                         //一共有九行
            int b = 1;                                      //每次循环重置变量b为1，为了下一步和a判断，从1开始运算。
            while(b<=a){                                   // a为几，打印几个运算式。
                int sum = a*b;                            //求乘积
                System.out.print(b+"*"+a+"="+sum+"  ");  //打印结果
                b++;                                    // 自增，为了跳出循环。
            }
            System.out.println(" ");                  // 作为换行使用，print不换行，println换行。
            a++;                                     //当a++循环到10，跳出循环，程序结束。
        }
    }
}

