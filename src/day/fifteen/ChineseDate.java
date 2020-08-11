package day.fifteen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Fate
 * @date 2020/8/10
 */
public class ChineseDate {
    public static void main(String[] args) {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("当前时间为:" + time);
    }
}
