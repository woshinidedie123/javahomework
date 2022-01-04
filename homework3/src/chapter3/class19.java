package chapter3;

import java.util.Scanner;

public class class19 {
	   public static void main(String[] args) {
	        // 获取三条边
	        Scanner input = new Scanner(System.in);
	        System.out.println("三条边：");
	        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();

	        // 从小到大排序（保持变量从a到c，仅在数值上调整）
	        double temp;
	        if(a > b){
	            temp = a;
	            a = b;
	            b = temp;
	        }
	        if(a > c){
	            temp = a;
	            a = c;
	            c = temp;
	        }
	        if(b > c){
	            temp = b;
	            b = c;
	            c = temp;
	        }

	        // 判断两条最短边的和是否大于第三边
	        if(a + b > c){
	            double perimeter = a + b + c;
	            System.out.println("周长为："+perimeter);
	        }else{
	            System.out.println("输入值不合法");
	        }
	   }
}