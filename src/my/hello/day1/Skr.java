package my.hello.day1;

public class Skr {
    public static void main(String[] args) {
        //百元百鸡
        //公鸡5元一只，母鸡3元一只，小鸡1元5只，100元要买100只鸡？有多少买法？
        int count = 1;
        for(int x=0;x<=20;x++){
            for(int y=0;y<=33;y++){
                for(int n=0;n<=100;n++){
                    if((x+y+n==100)&&(5*x+3*y+n/5==100)){
                        System.out.println("公鸡:"+x+"只"+"母鸡："+y+"只，"+"小鸡:"+n+"只。"+"第"+count+++"种买法");
                    }
                }
            }
        }
        System.out.println("一共有"+--count+"种买法");
    }
}
