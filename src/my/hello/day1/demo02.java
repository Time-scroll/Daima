package my.hello.day1;
//定义一个方法，用来求出1-100之间所有数字的和值结果
public class demo02 {
    public static  void main(String[] args) {
        System.out.println("");
    }

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int sum(){
        int a=0;
        for(int i=1;i<=100;i++){
            a=a+i;
        }
        /*while (i<100){
            a=a+i;
            i++;
        }*/
       /* do{
            a=a+i;
        }while(a<99);*/

        return a;
    }


}
