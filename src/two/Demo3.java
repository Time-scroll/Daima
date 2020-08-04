package two;

public class Demo3 {
    //创建了一个对象，通过对象调用方法
    public static <MainClass> void main(String[] args) {

       int a = new Demo3().abc(3);
       System.out.println(a);
    }
    public int abc(int a){
        return a;
    }
}
