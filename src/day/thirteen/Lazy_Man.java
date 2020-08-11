package day.thirteen;

public class Lazy_Man {
        //懒汉式单例,在需要对象时生成单例对象。
        public static Lazy_Man Lazy;
        private Lazy_Man(){}

        public static Lazy_Man getInstance(){
            if(Lazy==null){
                Lazy = new Lazy_Man();
            }
            return Lazy;
        }
}

