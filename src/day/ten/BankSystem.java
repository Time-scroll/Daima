package day.ten;

import java.util.Scanner;

import com.hw.transfersys.domain.Account;

/**
转帐
1. 面向对象分析：找出转帐这个功能所有对象
	帐户  银行系统
2. 创建找到对象的相应的类
3. 通过属性与方法来描述类

*/
public class BankSystem{
	static Scanner s=new Scanner(System.in);
	static int count=3;//定义登录的次数  次数用尽锁定卡号退出
	static int position=2;
		
	static	Account account1 = new Account("6223190116063865","李振",24000.0);
	static  Account account2 = new Account("6223190116061234","宁山聪",2000.0);
		// 所有帐户的信息
	static	Account[] accounts ={account1,account2};
	
	
	
	public static void main(String[] args){
		menu();
		
	}
	public static void menu(){
		System.out.println("**********中国银行系统***********");
		System.out.println("**********1.登录系统************");
		System.out.println("**********2.注册新账户***********");
		System.out.println("**********3.退出系统*************");
		int num = s.nextInt();
		if(num==1){
			login();//登录
		}else if(num==2){
			zhuce();//注册
		}else{
			System.out.println("欢迎您再次使用本系统。。。再见！！！");
			System.exit(0);//强制退出
		}
	}
	public static  void login() {
		System.out.println("请输入您的卡号:");
		String cardnum = s.next();
		for (int i = 0; i <accounts.length; i++) {
			if (accounts[i]!=null) {
				if (cardnum.equals(accounts[i].getAccountNum())) {
					System.out.println("login success!!!");
					menu1();
				}
			}
			
		}
		count--;
		if(count==0){
			System.out.println("您的卡号次数已经用尽系统强制退出！！！");
			System.exit(0);
		}
		System.out.println("您的卡号有误！！！请核对后重新输入！！！您当前还有"+count+"次机会");
		menu();
		
	}
	public static void menu1() {
		System.out.println("*******中国银行********");
		System.out.println("*******1.存款*********");
		System.out.println("*******2.取款**********");
		System.out.println("*******3.转账**********");
		System.out.println("*******4.查询余额********");
		System.out.println("*******5.查看绑定账户信息**");
		System.out.println("*******6.退出系统********");
		System.out.println("请选择：");
		int num =s.nextInt();
		switch (num) {
		case 1:
			System.out.print("卡号:");
			String cardnum = s.next();
			System.out.print("请输入金额:");
			double money = s.nextDouble();
			new BankSystem().add(money, cardnum);
		
			break;
		case 2:
			System.out.print("卡号:");
			String cardnum1 = s.next();
			System.out.print("请输入金额:");
			double money1= s.nextDouble();
			new BankSystem().remove(money1, cardnum1);
			break;
		case 3:
			System.out.print("请输入打款人帐号信息:");
			String removeNum = s.next();
			System.out.print("请输入收款帐号信息:");
			String addNum = s.next();
			System.out.print("请输入转帐金额:");
			double money2 = s.nextDouble();
			
			boolean flag = new BankSystem().change(money2, addNum, removeNum);
			
			if (flag){
				System.out.println("转帐成功！");
			}else {
				System.out.println("转帐失败，金额已经回滚！");
			}
		case 4:
			System.out.println("卡号：");
			String card=s.next();
			showAccountInfo(card);
		case 5:
			showAll();
		default:
			System.exit(0);
			break;
		}
		menu1();
		
	}
	public static void zhuce(){
		Account a=new Account();
		System.out.println("您的卡号为：");
		String accountNum=s.next();
		a.setAccountNum(accountNum);
		System.out.println("您的账户名：");
		String accountName=s.next();
		a.setAccountName(accountName);
		System.out.println("您要存入的金额：");
		double money = s.nextDouble();
		a.setMoney(money);
		//1.新建数组 并 扩容
		if(position>=accounts.length){
			Account[] accounts1=new Account[accounts.length*2];
			//2.循环遍历赋值
			for (int i = 0; i < accounts.length; i++) {
				accounts1[i]=accounts[i];
			}
			//引用指向新数组
			accounts=accounts1;	
		}
		accounts[position++]=a;
		System.out.println("注册成功！！！");
		menu();
	}
	
	
	public static void showAccountInfo(String num){
		for (Account item : accounts) {
			if (num.equals(item.getAccountNum())){
				System.out.println("*****帐户信息*****");
				System.out.println("帐号:" + item.getAccountNum());
				System.out.println("帐户名:" + item.getAccountName());
				System.out.println("余额:" + item.getMoney());
				break;
			}
		}
		menu1();
	}
	public static void showAll(){
		for (Account item : accounts) {
			if (item!=null) {
					System.out.println("*****帐户信息*****");
					System.out.println("帐号:" + item.getAccountNum());
					System.out.println("帐户名:" + item.getAccountName());
					System.out.println("余额:" + item.getMoney());
			}
		}
		menu1();
	}
	// 转帐       转账金额 打款人的卡号  收款人的卡号    转账成功与否:boolean
	public boolean change(double money, 
		String addNum, String removeNum){
			
		double money1 = remove(money,removeNum);
		
		boolean flag = false;
		
		// 扣钱成功 圈复杂度
		if (money1 > 0.0){//转给收款人
		   flag = add(money, addNum);
		   if(!flag) {//回滚到打款人的账户
			   add(money, removeNum);
		   }
		}
		
		return flag;
		
	}
	
	// 存钱         存款金额   账号   存款成功与否:boolean
	public boolean add(double money, String accountNum){
		// 根据由帐号从银行系统中把对应帐户信息取出来
		for (Account item : accounts) {
			if (accountNum.equals(item.getAccountNum())){
				     item.money+=money;
				return true;
			}
		}
		
		return false;
	}
	
	// 取钱    取款金额   卡号     取款返回金额 : double 
	public double remove(double money, String accountNum){
		for (Account item : accounts) {
			if (accountNum.equals(item.getAccountNum())){
				if (money <= item.getMoney()){
					item.money-= money;
					return money;
				}else {
					break;
				}
			}
		}
		return 0.0;
	}
	
}



