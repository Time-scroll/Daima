package two;

import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {

        for (int i=0;i<3;i++) {
            System.out.println("请输入账号和密码:");
            String userne = new Scanner(System.in).nextLine();
            String passwd = new Scanner(System.in).nextLine();
            if (userne.equals("admin")&&passwd.equals("sys123")) {
                System.out.println("login success!");
                break;
            } else {
                if(i==2){
                System.out.println("login failed,您的次数已经用完。");
            }else{
                    System.out.println("你还有"+(2-i)+"次机会");
                }
            }
        }
        System.exit(0);
    }
}
