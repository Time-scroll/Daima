
package day.eight;
/*
import java.util.Scanner;
public class Features {
    private Scanner in1 = new Scanner(System.in);
    static private Information[] imn = new Information[6];
    private int ak = 0;
    public static void main(String[] args) {
        Features out = new Features();
        out.Table();
    }

    private void Table(){
        System.out.println("--------------------------------------------------");
        System.out.println("          员工管理系统,请选择你需要的功能:           "+"\n");
        System.out.println("    1.新增  2. 查询   3.删除   4.修改  5. 退出"      );
        System.out.println("--------------------------------------------------");
        System.out.println("请选择你需要的功能：");
        int main = new Scanner(System.in).nextInt();

        switch(main){
            case 1:
                Information in2 = new Information();

                System.out.println("请输入员工的信息."+"\n");

                System.out.println("请输入员工的姓名：");
                in2.setName(in1.next());
                System.out.println("请输入员工的年龄：");
                in2.setAge(in1.nextInt());
                System.out.println("请输入员工的工号：");
                in2.setNumber(in1.next());
                System.out.println("请输入员工的地址：");
                in2.setAddress(in1.next());
                System.out.println("请输入员工的工资：");
                in2.setWage(in1.nextInt());
                if (ak >= imn.length){
                    Information[] temp = new Information[][imn.length * 2];
                    for (int i = 0; i < imn.length; i++) {
                        temp[i] = imn[i];
                    }
                    imn = temp;
                }
                imn[ak++] = in2;
                System.out.println("恭喜你！新增成功!");
                Showimn();
                Table();
            case 2:
                System.out.println("请输入要查询员工的工号");
                Printimn(in1.next());

                Table();
            case 3:
                System.out.println("请输入要删除员工的工号");
                String number = in1.next();
                DeletePrintimn(number);
                Showimn();
                Table();
            case 4:
                System.out.println("请输入要修改的员工的工号");
                String number1 = in1.next();
                ModifyPrintimn(number1);
                Showimn();
                Table();
            case 5:
                System.out.println("系统成功退出");
                break;
            default:
                System.out.println("提示 : 请输入正确的数值."+"\n");
                Table();


        }
    }

    private void Showimn(){
        System.out.println("序号  姓名   年龄   工号   地址   工资");
        for (int i = 0; i < imn.length; i++){
            if (imn[i] != null){
                System.out.print(i+1 + "  ");
                System.out.print("  "+imn[i].getName() + "    ");
                System.out.print(    imn[i].getAge() + "    ");
                System.out.print(    imn[i].getNumber() + "   ");
                System.out.print(    imn[i].getAddress() + "  ");
                System.out.println(  imn[i].getWage());
            }
        }
    }
    private void Printimn(String a) {
        System.out.println(a);
        for (int i = 0; i < imn.length; i++) {
            if (imn[i] != null && imn[i].getNumber().equals(imn)) {
                System.out.println("序号  姓名  年龄  工号  地址  工资");
                System.out.print(i + 1 + "  ");
                System.out.print(imn[i].getName() + "  ");
                System.out.print(imn[i].getAge() + "  ");
                System.out.print(imn[i].getNumber() + "  ");
                System.out.print(imn[i].getAddress() + "  ");
                System.out.println(imn[i].getWage());
            }else{
                System.out.println("找不到工号为"+a+"的员工信息");
            }
        }
    }
    private void DeletePrintimn(String number){
        Information[] temp = new Information[][imn.length];
        boolean flag = false;
        for (int i = 0; i < temp.length; i++){
            if (imn.equals(imn[i].getNumber())){
                flag = true;
                imn[i] = null;
                break;
            }
        }

        if (flag){
            System.out.println("删除员工成功!");
            int j = 0;
            int num1 = 0;
            for (int i = 0; i < temp.length; i++){
                if (imn[i] != null){
                    temp[j] = imn[i];
                }else {
                    if (++num1 < 2){
                        temp[j] = imn[++i];
                    }else {
                        break;
                    }

                }
                j++;
            }
            imn = temp;
        }
        else {
            System.out.println("删除员工失败!");
        }
    }

    private void ModifyPrintimn(String number1){
        Information updateEmp = null;
        for (Information item : imn){
            if (item.getNumber().equals(number1)){
                updateEmp = item;
                break;
            }
        }
        System.out.println("请输入员工的姓名");
        String str = in1.next();
        if ("".equals(str) == false){
            updateEmp.setName(str);
        }

        System.out.println("请输入员工的地址");
        str = in1.next();
        if ("".equals(str) == false){
            updateEmp.setAddress(str);
        }

        System.out.println("请输入员工的工资");
        int Wage = in1.nextInt();
        if (0.0 != Wage){
            updateEmp.setWage(Wage);
        }

        System.out.println("请输入员工的年龄");
        int age = in1.nextInt();

        if (0 != age){
            updateEmp.setAge(age);
        }

        System.out.println("用户信息信息成功！");


    }
}*/
