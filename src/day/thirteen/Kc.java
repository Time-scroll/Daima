
package day.thirteen;

public class Kc {
    static MS ms;
    public static void main(String[] args) {
        ms = new JZ();
        ms.GongXv();
        System.out.println("——————————————————————");
        ms = new BZ();
        ms.GongXv();
    }

}
abstract class MS{
    public   final void GongXv() {
        huo();
        tiao();
        bao();
        zuo();
        if (hook()) {
            cu();
        }

    }

    public boolean hook() {
        return false;
    }

    public void huo() {
        System.out.println("和面");

    }

    public abstract void tiao();

    public void bao() {
        System.out.println("包");

    }

    public abstract void zuo();

    public void cu() {
        System.out.println("加醋");

    }

}
class BZ extends MS{

    @Override
    public void tiao() {
        System.out.println("茴香馅的");

    }

    @Override
    public void zuo() {
        System.out.println("蒸");

    }

}
class JZ extends MS{

    @Override
    public void tiao() {
        System.out.println("鲅鱼");

    }

    @Override
    public void zuo() {
        System.out.println("煮");

    }
    @Override
    public boolean hook() {
        return true;
    }

}
