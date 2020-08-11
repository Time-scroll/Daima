package day.fourteen;
import org.junit.Test;

public class Abnormal {

     /*1.数组下标越界异常*/
    @Test
    public void test1(){
        int[] aRray = new int[5];
        System.out.println("数组Array索引下标为5的值为:"+aRray[5]);
    }

    /* 2.空指针异常*/
    String a;
    @Test
    public void test2(){
        Abnormal abnormal = new Abnormal();
        abnormal = null;
        System.out.println("内存地址值为"+abnormal.a);
    }

    /*3.算术异常*/
    @Test
    public void test3() {
        int dIvidend = 10;
        int divisor = 0;
        int qUotient = dIvidend / divisor;
        System.out.println("商为:" + qUotient);
    }


    // 4.数字格式化异常
    @Test
    public void test4(){
        String num = "路飞";
        System.out.println(Integer.parseInt(num));
    }

    // 5.ClassCastException异常（强制类型转换异常）
    static class Test5_1 extends Abnormal{

    }
    static class Test5_2 extends Abnormal{

    }


    public static void main(String[] args) {

        Abnormal out1 = new Test5_1();
        Abnormal out2 = new Test5_2();

        Test5_1 out3 = ( Test5_1) out1;
        Test5_1 out4 = ( Test5_1) out2;
        //ClassCastException异常出现的原因
    }
}
