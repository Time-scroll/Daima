package day.fifteen;

/**
 * @author Fate
 * @date 2020/9/8
 */
public class Demo00 {
    public<T> void f(T x){
        System.out.println(x.getClass().getName());
    }
    public static void main(String[] args) {
        Demo00 demo00 = new Demo00();
        demo00.f("");
        demo00.f(1);
        demo00.f(1.0);
        demo00.f(1.0f);
        demo00.f('c');
        demo00.f(demo00);


    }
}
