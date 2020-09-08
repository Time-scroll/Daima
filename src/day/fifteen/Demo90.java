package day.fifteen;

import java.util.ArrayList;

/**
 * @author Fate
 * @date 2020/9/7
 */
public class Demo90 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("马尔扎哈");
        arrayList.add("伊泽瑞尔");
        arrayList.add("吸血鬼");
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println(5.0/4);
        int a=3;
        int b=a++ + ++a;
        int c=--a - a--;
        System.out.println(c);
    }
}
