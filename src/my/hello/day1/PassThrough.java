package my.hello.day1;

public class PassThrough {
    public static void main(String[] args) {
        int namei = test1(50-30);
        int qiaoba = test2(30-20);
        int lufei = test3(20-12);
        int suolong = test4(12);
        int age=namei+qiaoba+lufei+suolong;
        System.out.println("所以娜美今年"+age+"岁");
    }
    public static int test1(int a){
        System.out.println("我是娜美，我比乔巴大"+a+"岁");
        return a;
    }
    public static int test2 (int b){
        System.out.println("我是乔巴，我比路飞大"+b+"岁");
        return b;
    }
    public static int test3 (int c){
        System.out.println("我是路飞，我比索隆大"+c+"岁");
        return c;
    }
    public static int test4 (int d){
        System.out.println("我是索隆，今年我"+d+"岁");
        return d;
    }
}
