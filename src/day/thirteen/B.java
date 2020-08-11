package day.thirteen;

public class B implements A {
    @Override
    public int method(int n) {
        int sum=1;
        for(int i=1+1;i<=n;i++){
            sum *= i;

        }
        return sum;
    }
}
