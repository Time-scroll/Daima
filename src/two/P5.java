package two;

public class P5 {
    public static void main(String[] args) {
        // 水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身 （百度百科）
        // 水仙花数：百位数的三次方+十位的三次方+个位数的三次方=本身
        int one;                    //个位数的变量
        int two;                    //百位数的变量
        int three;                  //千位数的变量
        int a=0;                    //定义变量a，为了统计有几个水仙花数
        for(int i=100;i<1000;i++){
            one=i%10;
            two=i/10%10;
            three=i/100;
            //求一个数的个位，十位，百位上的数值分别是几?
            int b=(int) (Math.pow(one,3)+Math.pow(two, 3)+Math.pow(three, 3));
            // Math.pow用来计算一个数的几次方。pow后面的括号里，前面是值，后面是几次方，+用来计算和。
            if(i==b){   //判断i和b是否相等，如果相等，就是水仙花数。
                System.out.println(i);   //打印输出这个水仙花数
                a++;     //计数，有几个水仙花数。
            }
        }
        System.out.println("一共有"+a+"个水仙花数");

    }
}
