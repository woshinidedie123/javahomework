package chapter3;

import java.util.Scanner;

public class class19 {
	   public static void main(String[] args) {
	        // ��ȡ������
	        Scanner input = new Scanner(System.in);
	        System.out.println("�����ߣ�");
	        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();

	        // ��С�������򣨱��ֱ�����a��c��������ֵ�ϵ�����
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

	        // �ж�������̱ߵĺ��Ƿ���ڵ�����
	        if(a + b > c){
	            double perimeter = a + b + c;
	            System.out.println("�ܳ�Ϊ��"+perimeter);
	        }else{
	            System.out.println("����ֵ���Ϸ�");
	        }
	   }
}