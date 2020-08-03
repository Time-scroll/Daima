package day.eight;

public class E {
    public static void main(String[] args) {
        Monkey in = new People("白帽子");
        People out = new People("黑帽子");
        in.speak();
        ((People)in).think();
        out.speak();
        out.think();
        System.out.println(out instanceof Monkey);
    }
}
