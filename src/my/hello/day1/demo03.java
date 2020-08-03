package my.hello.day1;
//定义一个方法，用来打印指定次数的helloworld
public class demo03 {
    public static void main(String[] args) {
        method3(5);
    }
    public static int method3(int x){
        int a;
        for(a=1;a<=x;a++){
            System.out.println("hello,world");
        }
        return x;
    }
}
  