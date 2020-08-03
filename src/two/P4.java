package two;

public class P4 {
    public static void main(String[] args) {
        // 使用穷举法，循环找出一共有多少组合。
        int count=1;                                                    //计数器
        for (int appler = 0; appler <= 10; appler++) {                   //10元只买苹果，一共能买10个。
            for (int oranger = 0; oranger <=5; oranger++) {              //10元只买橘子，一共能买5个。
                for (int mg = 0; mg <=2; mg++){                          //10元只买芒果，一共能买2个。
                    if(appler*1 + oranger*2 + mg*4 == 10)                //判断购买的苹果,橘子,芒果的价钱是否等于10
                    System.out.println("苹果" + appler + "个，橘子" + oranger + "个，芒果" + mg + "个。"+"有"+count+++"个组合");

                }
            }
        }

    }
}
