
package two;

import my.hello.day1.demo02;

public class demo01 {
    public static void main(String[] args) {
       demo02 a = new demo02("xiaoming");
        System.out.println(a.getName());
        int b = 0;
        System.out.println(b);
        demo02 xiaoming = new demo02();

        demo02 xh = new demo02();
        xiaoming.name = "小明";
        System.out.println(xiaoming.name);
        xh.name = "小红";
        System.out.println(xh.name);
    }
}





