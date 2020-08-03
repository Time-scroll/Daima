package my.hello.day1;
//1.成员变量是直接定义在类里面，方法外面的。
//2.成员方法中不要写static
public class Student {

    //成员变量
    String name; //姓名
    int age; //年龄

    //成员方法
    public void met0(){
        System.out.println("吃饭饭！");
    }
    public void met1(){
        System.out.println("睡觉觉！");
    }
    public void met2(){
        System.out.println("学习!");
        System.out.println("123".equals("123"));
    }
}
