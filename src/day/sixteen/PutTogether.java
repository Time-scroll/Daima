package day.sixteen;

/**
 * @author Fate
 * @date 2020/8/11
 */
public class PutTogether {

    /** 模拟StringBuilder类 + 重写toString方法返回最终结果。*/
    static class StringBuilder1 {
        String msg = "";

        public StringBuilder1 append(Object msg1) {
            msg += msg1;
            return this;
        }

        @Override
        public String toString() {
            return msg;
        }
    }

    public static void main(String[] args) {
        // StringBuilder1 a = new StringBuilder1();
        // a.append(123).append(3232);
        // System.out.println(a);

        StringBuilder1 a = new StringBuilder1();

        //链式方法
        a.append(123).append(321).append(123321);
        System.out.println(a.toString());
    }


}
