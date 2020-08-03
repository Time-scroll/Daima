package two;

import java.sql.SQLOutput;

public class digui {
    public static void main(String[] args) {
        System.out.println("公众号：Java3y：" + sum(100));
    }

    /**
     *
     * @param n 要加到的数字，比如题目的100
     * @return
     */
    public static int sum(int n) {

        if (n == 1) {
            return 1;
        } else {
            return sum(n - 1) + n;
        }
    }}