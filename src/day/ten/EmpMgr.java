package day.ten;

import java.util.Scanner;

public class EmpMgr {
	static Scanner s=new Scanner(System.in);
	static Employee[] emps=new Employee[2];
	//static int[] array=new int[8];
	static int position=0;//角标
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		System.out.println("/*************************************************/");
		System.out.println("欢迎进入到员工管理系统 ^0^: 请选择如下功能:");
		System.out.println("1. 新增   2. 查询   3.删除   4.修改 5.展示员工信息  6.退出");
		System.out.println("/************************************************/");
		int num = s.nextInt();
		switch (num) {
		case 1:
			add();
			break;
		case 2:
			showByNum();
			break;
		case 3:
			deleteByNum();
			break;
		case 4:
			updateByNum();
			break;
		case 5:
			showAllIfo();
			break;

		default:
			System.out.println("bye....");
			break;
		}
		menu();
	}
	//新增员工
	private static void add() {
		//1.新建员工的对象
		Employee e=new Employee();
		System.out.println("请输入姓名:"); 
		String name=s.next();
		System.out.println("请输入年龄:"); 
		int age=s.nextInt();
		System.out.println("请输入工号:");
		int num=s.nextInt();
		System.out.println("请输入地址:"); 
		String address=s.next();
		System.out.println("请输入工资:");
		double sal=s.nextDouble();
		e.setEmp_name(name);
		e.setEmp_address(address);
		e.setEmp_age(age);
		e.setEmp_num(num);
		e.setEmp_sal(sal);
		if (position>=emps.length) {//当下标大于等于数组的长度   3》=2
			//1.新建数组                                          成长因子2  
			Employee[] emps1=new Employee[emps.length*2];
			//2.循环遍历赋值
			for (int i = 0; i < emps.length; i++) {
				emps1[i]=emps[i];//把之前的数组里面的emp对象赋值给新数组
			}
			//3.把emps的引用指向emps1
			emps=emps1;
		}
		emps[position++]=e;
		System.out.println("add  success!!!");
	}
	private static void showByNum() {
		System.out.println("please num:");
		int num=s.nextInt();
		for (int i = 0; i < emps.length; i++) {
			if (emps[i]!=null) {
				if (num==emps[i].getEmp_num()) {
					System.out.println("****员工信息******");
					System.out.println("****"+emps[i].getEmp_name()+"******");
					System.out.println("***************");
					System.out.println("***************");
					System.out.println("***************");
					System.out.println("***************");
				}
			}
			
		}
		
	}
	private static void deleteByNum() {
		System.out.println("please num:");
		int num=s.nextInt();
		for (int i = 0; i < emps.length; i++) {
			if (num==emps[i].getEmp_num()) {
				emps[i]=null;
				System.out.println("delete success!!!");
			}
		}
		
	}
	private static void updateByNum() {
		System.out.println("please num:");
		int num=s.nextInt();
		for (int i = 0; i < emps.length; i++) {
			if (num==emps[i].getEmp_num()) {
				System.out.println("请输入姓名:"); 
				String name=s.next();
				System.out.println("请输入年龄:"); 
				int age=s.nextInt();
				System.out.println("请输入工号:");
				int num1=s.nextInt();
				System.out.println("请输入地址:"); 
				String address=s.next();
				System.out.println("请输入工资:");
				double sal=s.nextDouble();
				emps[i].setEmp_name(name);
				emps[i].setEmp_address(address);
				emps[i].setEmp_age(age);
				emps[i].setEmp_num(num1);
				emps[i].setEmp_sal(sal);
			}
		}
		
	}
	private static void showAllIfo() {
		for (int i = 0; i < emps.length; i++) {
			if (emps[i]!=null) {
				System.out.println("****员工信息******");
				System.out.println("****"+emps[i].getEmp_name()+"******");
				System.out.println("***************");
				System.out.println("***************");
				System.out.println("***************");
				System.out.println("***************");
			}
				
			
		}
		
	}
	

}
