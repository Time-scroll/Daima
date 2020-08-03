package my.hello.day1;

public class Student1 {
    String name;
    int age;


    public Student1(String name1,int age1){
        name = name1;
        age = age1;
    }

    public static void main(String[] args) {
        Student1[] stus={new Student1("张三",24),new Student1("李四",21)};
        System.out.println(stus[0]);
        System.out.println("12"+10);
    }
}
