package two;

public class AA {
    public static <MainClass> void main(String[] args) {

       int a = new AA().abc(3);
       System.out.println(a);
    }
    public int abc(int a){
        return a;
    }
}
