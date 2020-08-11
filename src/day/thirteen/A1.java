package day.thirteen;

public class A1 implements A{
    @Override
    public int method(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
}
