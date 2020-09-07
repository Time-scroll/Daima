package day.eleven;

/**
 * @author Fate
 * @date 2020/8/21
 */

public class Hello {
    public static void main(String[] args) {
        String name = "透明的";
        int num = name.hashCode();
        switch (num){
            case 1:
                System.out.println("Helloworld");
            case 2:
                System.out.println("Goodbye");
            case 36280965:
                System.out.println("Hello");
            default:
                System.out.println("至繁归于至简");
        }
        main(null);
    }
}
