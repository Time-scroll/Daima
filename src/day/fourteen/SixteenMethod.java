package day.fourteen;

/**
 * @author Fate
 * @date 2020/8/7
 */
public class SixteenMethod {
        public static void main(String[] args) {
            // 1.public char charAt(int i) 根据下标返回对应的字符
            String kIll = "1234";
            System.out.println(kIll.charAt(3));

            // 2.public int length() 返回字符长度
            System.out.println(kIll.length());

            // 3.public String replaceAll(String src, String rec) 把src代表的字符串，替换成rec的字符串，最后返回替换完毕的字符串。
            String kIll1 = "abcdefgcde";
            System.out.println(kIll1.replaceAll("cde", "123"));
            System.out.println(kIll1.replace('a', '9'));

            // 4.public int indexOf(String str)返回传入的str在当前字符串的位置，当str在当前字符串查找不到的情况下返回-1.

            System.out.println(kIll1.indexOf("cd"));

            // 5.public String split(String str)用str把这个当前的字符串分隔成为字符串数组。
            String s = "心灵运输者-肖申克的救赎-铁拳";
            String[] array = s.split("-");
            for (String item : array) {
                System.out.println(item);
            }
            // 6. Intern() 强制去常量池中找对象。

            // 7.getBytes(); 字符串转字节数组。
            String mot = "abcd";
            for (byte item : mot.getBytes()) {
                System.out.println(item);
            }

            // 8.通过字节数组构造字符串
            String string = new String(new byte[]{3,2,1});

            // 9.toCharArray() 将此字符串转换为一个新的字符数组。
             "乔布斯".toCharArray();

            // 10.startWith() endWith() 判断是否是一个前缀开始，是否是一个后缀结束。
            boolean result1 = kIll1.startsWith("a");
            boolean result = kIll1.endsWith("e");
            System.out.println(result);


            // 11.equals() 判断两个字符串的值是否相等。
            "aka".equals("aka");

            // 12.equalsIgnoreCase(String anotherString) 忽略大小写判断两个字符串是否相等。
            String num1 = "AbcD";
            String num2 = "abcd";
            num1.equalsIgnoreCase(num2);

            // 13.toUpperCase() toLowerCase() 转换大小写用的
            " My best girl ".toLowerCase();
            "Fate".toUpperCase();

            // 14.subString(int start , int end) 取子串
            String kIll2 = "qwer";
            System.out.println(kIll2.substring(0,4));

            // 15.trim() 去掉字符串两边的空格.
            String kIll4 = " Mydream ";
            System.out.println(kIll4.trim());

            // 16.valueOf 可以把基本类型的值转成字符串
            String kIll5 = String.valueOf(123456);
            System.out.println(kIll5);

            // 17.Integer.parseInt() 将整型数据Integer转换为基本数据类型int
            String kIll6="123";
            int out = Integer.parseInt(kIll6);
            System.out.println(out);

        }
}

