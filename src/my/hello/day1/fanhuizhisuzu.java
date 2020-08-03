package my.hello.day1;

public class fanhuizhisuzu {
    public static void main(String[] args) {
        int[] he = method1(10,20,30);
        System.out.println(he[0]);
        System.out.println(he[1]);
    }
    public static int[] method1(int a,int b,int c){
        int sum=a + b + c;
        int avg=(a + b + c)/3;
        int[] suzu={ sum,avg };
        return suzu;
    }
}
