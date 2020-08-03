package my.hello.day1;

import java.util.Scanner;

public class SelectSort {

	public static void main(String[] args) {
		int[] array = {50,60,10,20,30,80,90,75,25,11};
		int[] end1 = new int[array.length+1];
		System.out.print("请输入插入的数字：");
		Scanner in  =new Scanner(System.in);
		int c=in.nextInt();
		for(int i=0;i<array.length;i++){
			if(c>=array[i]){
				end1[i]=c;
				for(i=i+1;i<end1.length;i++){
					end1[i]=array[i-1];
				}
			}else{
				end1[i]=array[i];
			}
		}
		System.out.println("插入之后的数组为：");
		int[] end = end1;
		int tmp = 0;
		for(int j = 0; j < end.length; j++){
			for(int i = j+1; i < end.length; i++){
				if(end[j]> end[i]){
					tmp = end[j];
					end[j] = end[i];
					end[i] = tmp;

				}
			}System.out.println(end[j]);
		}





	}

}
