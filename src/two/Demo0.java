package two;

public class Demo0 {
    //求1到1000的和

    public static void main(String[] args) {
        int a=0;
        int sum = 0;
        while(a<=1000) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
