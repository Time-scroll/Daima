package my.hello.day1;

public class Array4 {
        public static void main(String[] args){
            int[] arr = {12,14,16,17,11,19};
            int[] arr1 = new int[arr.length+1];
            int value = 34;

            for(int i=0;i<arr.length;i++){
                if(i==0){
                    arr1[0]=12;
                    System.out.println(arr1[0]);
                }if(i==1){
                    arr1[1]=value;
                    System.out.println(arr1[1]);
            }if(i>1){
                    arr1[i]=arr[i];
                    System.out.println(arr1[i]);
        }
    }


}
}
