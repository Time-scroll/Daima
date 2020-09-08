package day.fifteen;

/**
 * @author Fate
 * @date 2020/9/8
 */
public class Array1 {
    public static void main(String[] args) {
        int[] array = {2,1,5,4,3};
        int temp=0;
        for(int i=0;i<array.length-1;i++) {
            for(int j = 0; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    temp=0;
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }
        for(int a:array){
            System.out.println(a);
        }
    }
}
