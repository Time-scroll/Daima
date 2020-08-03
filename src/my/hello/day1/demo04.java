package my.hello.day1;
//比较两个数据是否相等。
//参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中测试。
public class demo04 {
    public static void main(String[] args) {
        System.out.println(method1(1,2));
        System.out.println(method1((short)20,(short)30));
    }
    public static boolean method1(byte a,byte b){
        boolean same;
        if(a==b){
            same = true;
        }else{
            boolean flase;
            same = false;
        }
        return same;
    }
    public static boolean method1(short a,short b){
        boolean same = a == b ? true : false;
        return same;
    }
    public static boolean method1(int a,int b){
        return a == b;
    }
    public static boolean method1(long a,long b){
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}
