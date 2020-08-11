package day.thirteen;

public class Hungry_Man {
        //饿汉式，在类加载时提前实例化一个对象。
        private static Hungry_Man Hungry = new Hungry_Man();
        private Hungry_Man(){}

        public static Hungry_Man getInstance(){
            return Hungry;
        }
}

