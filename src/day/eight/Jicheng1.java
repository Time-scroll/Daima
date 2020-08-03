package day.eight;

public class Jicheng1 extends Juxing {
    private int Long;
    private int width;
    private int height;

    public int vOlume(int Long,int width,int height){
        int vOlume = Long * width * height;
        System.out.println("长方体的体积为:"+vOlume);
        return vOlume;
    }
}
