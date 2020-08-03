package my.hello.day1;

public class max {
    public static void main(String[] args) {
        /*int[] array ={ 5,15,30,20,10000};
        int max= array[0]; //比武擂台

        for (int i = 1;i<array.length;i++){
            if(array[i] > max) {
                max = array[i];
                System.out.println(max);
            }
        }
        System.out.println(max);
        }*/ //最大数值


        //最小值
        int[] array2 ={ 5,15,30,-20,10000};
        int min= array2[0]; //比武擂台

        for (int a = 1;a<array2.length;a++){
            if(array2[a] < min) {
            min = array2[a];
            System.out.println(min);
        }
    }
        System.out.println(min);
}
}
