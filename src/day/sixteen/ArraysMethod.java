package day.sixteen;
import java.util.Arrays;

/**
 * @author Fate
 * @date 2020/8/11
 */

class Arrayss<fori> {
    private Arrayss() {
    }
    static Arrayss arrayss = new Arrayss();

    public static Arrayss getInstance() {
        return arrayss;
    }

    /** 定义一个数组并赋值 */
    int[] array = {1, 0, 1, 5, 3, 2};

    /** 使用Arrays工具类的 sort() 方法分别对数组进行排序 */
    public void sort() {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    /** 使用Arrays工具类的 copyOf() 方法对数组进行复制 */
    public void copyOf() {
        int[] array1 = Arrays.copyOf(array, 6);

        // toString() 方法字符串表现形式
        System.out.println(Arrays.toString(array1));
    }

    /** 使用Arrays工具类的 binarySearch() 方法对数组进行指定元素的查找 */
    public void binarySearch() {
        System.out.println(Arrays.binarySearch(array, 5));
    }

    /** 使用Arrays工具类的 fill() 方法对数组进行添加元素 */
    public void fIll() {
        Arrays.fill(array, 3);
        System.out.println(Arrays.toString(array));
    }
}

/**
 * @author Fate
 * @date 2020/8/11
 */

public class ArraysMethod {
    public static void main(String[] args) {
        Arrayss arrayss = Arrayss.getInstance();
        arrayss.sort();
        arrayss.copyOf();
        arrayss.binarySearch();
        arrayss.fIll();
    }
}
