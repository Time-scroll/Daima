package my.hello.day1;
//定义一个方法，判断两个数字是否相同
public class demo01 {
    public static void main(String[] args) {
        boolean a=methad1(10,50);
        System.out.println(a);
    }
    public static boolean methad1(int a,int b){
        boolean daan;
        /*if(a==b){
            daan=true;
        }else{
            daan=false;
        }*/
//        daan = a == b ? true : false;
        return a == b;
    }
}
