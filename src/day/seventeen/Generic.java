package day.seventeen;

/**
 * @author Fate
 * @date 2020/8/15
 */
public class Generic {
    public static void main(String[] args) {
        A<String> a = new A<>();
        System.out.println(a.show("helloworld"));
        a.setName("hello");
        System.out.println(a.getName());

        //接口
        B<String> b = new B<>();
        b.show(a);
    }
}

class A<T> {
    private T name;

    public <M> M show(M m){
        return m;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}

interface WWW<String>{
    public String show(A a);
}

class B<String> implements WWW<String>{


    @Override
    public String show(A name){
        return (String) name;
    }



}

