package two;

public class Sz {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("总和"+result[0]);
        System.out.println("平均数为"+result[1]);
        System.out.println(result);
    }
    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum,avg};
        System.out.println("calculate方法内部数组是:");
        System.out.println(array);
        return array;



    }
}
