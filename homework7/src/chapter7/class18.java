package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class class18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 主方法：声明一个数组
        double[] list = new double[10];
        //2. 主方法：读取double型值，并将这些值存放在数组中
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("请输入10个double型值：");
        for (int i = 0; i < 10 ; i++){
            list[i] = input.nextDouble();
        }
        //3. 主方法：调用自定义方法bubble，传入刚刚赋值完的数组，接收排序好的数组
        list = bubble(list);
        //4. 主方法：输出接收的数组
        System.out.print(Arrays.toString(list));
    }
    //5. bubble方法：对数组进行冒泡排序
    public static double[] bubble(double[] list){
        //1. 获取list长度，声明临时存储变量temp
        int length = list.length;
        double temp = 0;
        //2. 双层遍历list，如果前一个值>后一个值则交换两个数值
        for (int a = 0 ; a < length - 1 ; a++){
            for (int i = 0 ; i < length - 1 ; i++){
                if (list[i] > list[i+1]){
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }
        //3. 返回list数组
        return list;
	}

}
