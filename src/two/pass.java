package two;

public class pass {
    public static void main(String[] args) {
        short s=222;
        long l=3000;
        System.out.println("short的范围为"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
        System.out.println("long的范围为"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);

        int a=25;
        System.out.println(a/10.0f);
        System.out.println();

        int b=(a++)+(--a)+(a++)*2+a+(++a);
        System.out.println(b);

    }
}
