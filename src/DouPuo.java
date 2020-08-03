import java.util.Scanner;

public class DouPuo {
    public static void main(String[] args) {
        System.out.println("----<<斗破苍穹>>----");
        System.out.println("----作者：天蚕土豆----");
        System.out.println("请问你想要观看第几章?");
        System.out.println("提示输入:（0为目录页，1~5为章节)");
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a>=0&&a<=6){
            switch(a){
                case 0:
                    mulu(0);
                    if(a==0)
                    break;
                case 1:
                    diyi(1);
                    break;
                case 2:
                    dier(2);
                    System.out.println("是否需要跳转到下一章或上一章?提示输入:(1为上一章节，3为下一章节,输入其他正整数退出)");
                    int up = in.nextInt();
                    if(up == 1){
                        diyi(1);
                    }else if(up == 3){
                        disan(2);
                    }
                    if(up!=1|up!=3){
                        break;
                    }
                case 3:
                    disan(3);
                    System.out.println("是否需要跳转到下一章或上一章?提示输入:(2为上一章节，4为下一章节,输入其他正整数退出)");
                    up =in.nextInt();
                    if(up==2){
                        dier(1);
                    }else if(up==4){
                        disi(2);
                    }
                    if(up!=2|up!=4&&up!=0) {
                        break;
                    }
                case 4:
                    disi(4);
                    System.out.println("是否需要跳转到下一章或上一章?提示输入:(3为上一章节，5为下一章节,输入其他正整数退出)");
                    up =in.nextInt();
                    if(up==3){
                        disan(1);
                    }else if(up==5){
                        diwu(2);
                    }
                    if(up!=3|up!=5&&up!=0) {
                        break;
                    }

                case 5:
                    diwu(5);
                    break;
            }
        }else{
            System.out.println("请按提示进行输入.");
        }
        main(null);
    }

    public static int mulu(int one){
        System.out.println("----第一章 陨落的天才----");
        System.out.println("----第二章 斗气大陆----");
        System.out.println("----第三章 客人----");
        System.out.println("----第四章 云岚宗----");
        System.out.println("----第五章 纳兰嫣然----完成");
        return one;
    }
    public static int diyi(int one){
        System.out.println("----第一章 陨落的天才----");
        System.out.println("  “斗之力，三段！”\n" +
                            "望着测验魔石碑上面闪亮得甚至有些刺眼的五个大字，\n" +
                            "少年面无表情，唇角有着一抹自嘲，紧握的手掌，\n" +
                            "因为大力，而导致略微尖锐的指甲深深的刺进了掌心之中，\n" +
                            "带来一阵阵钻心的疼痛…\n\n");
        return one;
    }
    public static int dier(int one){
        System.out.println("----第二章 斗气大陆----");
        System.out.println("  “贵客？谁啊？”萧炎好奇的问道。\n" +
                            "“明天就知道了.”对着萧炎挤了挤眼睛，萧战大笑而去，留下无奈的萧炎。\n" +

                            "“放心吧，父亲，我会尽力的！”抚摸着手指上的古朴戒指，萧炎抬头喃喃道。\n" +

                            "在萧炎抬头的那一刹，手指中的黑色古戒，却是忽然亮起了一抹极其微弱的诡异毫光，毫光眨眼便逝，没有引起任何人的察觉…\n\n");
        return one;
    }
    public static int disan(int one){
        System.out.println("----第三章 客人----");
        System.out.println("床榻之上，少年闭目盘腿而坐，双手在身前摆出奇异的手印，\n" +
                           "胸膛轻微起伏，一呼一吸间，形成完美的循环，而在气息循环间，\n" +
                           "有着淡淡的白色气流顺着口鼻，钻入了体内，温养着骨骼与肉体。\n" +
                           "在少年闭目修炼之时，手指上那古朴的黑色戒指，再次诡异的微微发光，旋即沉寂…\n\n");
        return one;
    }
    public static int disi(int one){
        System.out.println("----第四章 云岚宗----");
        System.out.println(" 倾耳听了一会，萧炎便是有些无聊的摇了摇头…\n" +
                "“萧炎哥哥，你知道他们的身份吗？”就在萧炎无聊得想要打瞌睡之时，身旁的熏儿，纤指再次翻开古朴的书页，目不斜视的微笑道。\n" +
                "“你知道？”好奇的转过头来，萧炎惊诧的问道。\n" +
                "“看见他们袍服袖口处的云彩银剑了么？”微微一笑，熏儿道。\n\n");
        return one;
    }
    public static int diwu(int one){
        System.out.println("----第五章 纳兰嫣然----完成");
        System.out.println("“咳。”白袍老者轻咳了一声，站起身来对着萧战拱了拱手，微笑道：“萧族长，此次前来贵家族，主要是有事相求！”\n" +
                "“呵呵，葛叶先生，有事请说便是，如果力所能及，萧家应该不会推辞。”对于这位老者，萧战可不敢怠慢，连忙站起来客气的道，" +
                "不过由于不知道对方到底所求何事，所以也不敢把话说得太满。\n" +
                "“呵呵，萧族长，你可认识她么？”葛叶微微一笑，指着身旁的少女含笑问道。\n" +
                "“呃…恕萧战眼拙，这位小姐…”闻言，萧战一愣，上下打量了一下少女，略微有些尴尬的摇了摇头。\n\n");
        return one;
    }

}

