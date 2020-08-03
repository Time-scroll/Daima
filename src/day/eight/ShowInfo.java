package day.eight;

import java.util.Scanner;

public class ShowInfo {

	static Employee[] emp = new Employee[10];
	
	public static void main(String[] args) {
		
		System.out.println("/*************************************************/");
		System.out.println("欢迎进入到员工管理系统 ^0^: 请选择如下功能:");
		System.out.println("1. 新增   2. 查询   3.删除   4.修改");
		System.out.println("/************************************************/");
		System.out.println("请选择_");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		gotoInfo(num);

	}
	public static void selectNum(){
		System.out.println("1. 新增   2. 查询   3.删除   4.修改");
		System.out.println("请选择_");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		gotoInfo(num);
		
		
	}
	
	public static void gotoInfo(int num){
		switch(num){
		case 1:
			insertInfo();
			break;
		case 2:
			selectInfo();
			break;
		case 3:
			deleteInfo();
			break;
		case 4:
			updateInfo();
			break;
		default:
			System.out.println("您输入的数字功能不存在");
			selectNum();
	}
	}
	
	/**
	 * 1. 新增员工信息
	 */
	public static void insertInfo(){
		
		Scanner sc  = new Scanner(System.in);
		
		// 获取输入姓名
		System.out.println("请输入姓名:");
		String name = sc.next();
		
		// 获取输入的年龄 
		System.out.println("请输入年龄:");
		int age = sc.nextInt();

		// 获取输入的工号
		System.out.println("请输入工号:");
		String id  = sc.next();
		
		// 获取输入的地址
		System.out.println("请输入地址:");
		String address = sc.next();
		
		// 获取输入的工资
		System.out.println("请输入工资:");
		int salary = sc.nextInt();
		
		// 创建一个employee对象，将输入的内容存入对象中
		Employee employee = new Employee();
		employee.setName(name);
		employee.setAge(age);
		employee.setId(id);
		employee.setAddress(address);
		employee.setSalary(salary);
		
		// 循环判断是否姓名相同的用户已经存在
		for(int i = 0; i < emp.length; i++){
			// 如果用户存在 并且 该用户的姓名和输入的姓名相同时
			if(emp[i] != null && emp[i].getName().equals(name)){
				System.out.println("抱歉，该用户已经存在");
				return;
			}
		}
		
		// 循环找的相应位置 存入用户信息
		for(int i = 0; i < emp.length; i++){
			
			if(emp[i] == null){
				emp[i] = employee;
				System.out.println("恭喜您！新增成功!!");
				showAllInfo();
				selectNum();
				break;
			}
		}
		
	}
	
	/**
	 * 2 查询信息
	 */
	public static void selectInfo(){
		System.out.println("请输入要查询的工号");
		
		// 获取要输入的工号
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		
		
		for(int i = 0; i < emp.length; i++){
			if(emp[i] != null && emp[i].getId().equals(id)){
				System.out.println("/*****************************************************/");
				System.out.println("序号     姓名      年龄      工号      地址      工资");
				System.out.print((i+1) + "  ");
				System.out.print(emp[i].getName() + "  ");
				System.out.print(emp[i].getAge() + "  ");
				System.out.print(emp[i].getId() + "  ");
				System.out.print(emp[i].getAddress() + "  ");
				System.out.print(emp[i].getSalary() + "  ");
				System.out.println();
				System.out.println("/*****************************************************/");
				selectNum();
				return;
			}
		}

		System.out.println("根据此工号查询不出来对应记录");
		selectNum();

	}
	
	/**
	 * 3:删除员工信息
	 */
	public static void deleteInfo(){
		System.out.println("请输入要删除的员工的工号");
		// 获取要删除的员工工号
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		
		System.out.println("请确认真的要删除此记录吗？(y/n)");
		String check = sc.next();
		if("y".equals(check)){
			// 循环查找要删除的记录
			for(int i = 0; i < emp.length; i++){
				
				if(emp[i] != null && emp[i].getId().equals(id)){
					emp[i] = null;
					System.out.println("删除成功");
					showAllInfo();
					selectNum();
					return;
				}
			}
			System.out.println("没有此记录");
			selectNum();
			
		}else{
			selectNum();
		}
		
	}
	
	/**
	 * 4: 修改员工信息
	 */
	public static void updateInfo(){
		System.out.println("请输入要修改的员工的工号");
		
		// 获取要修改的员工工号
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		for(int i = 0; i < emp.length; i++){
			
			if(emp[i] != null && emp[i].getId().equals(id)){
				// 获取输入姓名
				System.out.println("请输入姓名:");
				String name = sc.next();
				
				// 获取输入的年龄 
				System.out.println("请输入年龄:");
				int age = sc.nextInt();

				// 获取输入的工号
				System.out.println("请输入工号:");
				String id1  = sc.next();
				
				// 获取输入的地址
				System.out.println("请输入地址:");
				String address = sc.next();
				
				// 获取输入的工资
				System.out.println("请输入工资:");
				int salary = sc.nextInt();
				
				// 创建一个employee对象，将输入的内容存入对象中
				Employee employee = new Employee();
				employee.setName(name);
				employee.setAge(age);
				employee.setId(id1);
				employee.setAddress(address);
				employee.setSalary(salary);
				
				emp[i] = employee;
				System.out.println("修改成功");
				showAllInfo();
				selectNum();
				return;
			}
		}
		
		System.out.println("没有此账号，无法修改");
		selectNum();
		
	}
	
	
	
	/**
	 * 显示所有用户信息
	 */
	public static void showAllInfo(){
		System.out.println("/*****************************************************/");
		System.out.println("序号     姓名      年龄      工号      地址      工资");
		// 循环显示出所有用户信息
		for(int i = 0; i < emp.length; i++){
			if(emp[i] != null){
				System.out.print((i+1) + "  "); // 序号
				System.out.print(emp[i].getName() + "  "); // 姓名
				System.out.print(emp[i].getAge() + "  "); // 年龄
				System.out.print(emp[i].getId() + "  "); // 工号
				System.out.print(emp[i].getAddress() + "  "); // 地址
				System.out.print(emp[i].getSalary() + "  "); // 工作
				System.out.println(); // 换行
			}
		}
		System.out.println("/****************************************************/");
		
	}
	

}
