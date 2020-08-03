package my.hello.day1;

public class Nine1 {
        public static void main(String[] args) {
            for(int a=1;a<=9;a++) {
                for (int b = 1; b <= a; b++) {
                    int sum = a * b;
                    System.out.print(b + "*" + a + "=" + sum + "  ");
                }
                System.out.println(" ");
            }
           /* int a = 1;
            while(a<=9){
                int b = 1;
                while(b<=a){
                    int sum = a*b;
                    System.out.print(b+"*"+a+"="+sum+"  ");
                    b++;
                }
                System.out.println(" ");
                a++;
            }
        }*/
    }

}
