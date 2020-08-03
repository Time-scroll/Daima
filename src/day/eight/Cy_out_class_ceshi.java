package day.eight;
public class Cy_out_class_ceshi {
    public static void main(String[] args) {
        //测试

        Cy_out_class out = new Cy_out_class();
        out.oUter();
        //通过它的外部类来实例化内部类~
        Cy_out_class.Cy_in_class in = new Cy_out_class().new Cy_in_class();
        System.out.println(out.equals(in));
        System.out.println(out.toString());
        System.out.println("123".equals("123"));
    }
}
