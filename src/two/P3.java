package two;

public class P3 {
    public static void main(String[] args) {
        int i=1;

        while(i<=6){                        //一共有6行
            int j=1;                        //
            while(j<=6-i){                  //首行为1个*,减i，代表循环6-i次，也就代表打印几个空格。
                System.out.print(" ");
                j++;                        //自增，跳出循环
            }
            int a = 1;                      // a为最外层while循环里的变量，为的是在下次循环重置变量a的值，来打印奇数值（2*i-1)
            while(a <= i*2-1){
                System.out.print("*");
                a++;                        //自增，跳出循环。
            }
            System.out.println("");         // 作为换行使用。
            i++;                            // 自增，跳出循环，程序结束。
        }

    }
}
