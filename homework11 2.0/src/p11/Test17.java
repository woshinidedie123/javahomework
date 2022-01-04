package p11;

import java.util.ArrayList;
import java.util.Scanner;
public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		//创建一个数组列表来保存“因子”
		ArrayList<Integer> list=new ArrayList<>();
		
		
		System.out.print("Enter an integer m: ");
		

		int number=input.nextInt();
		input.close();
		
		//得到 M
		int m=number;
		
		int i=2;
		
		System.out.print("因子为： ");
		
		while(number != 1) {
			if(number % i ==0) {
				number = number / i ;
				System.out.print( i + " ");//输出因子
				list.add(i);
			}
			else {
				i++;
			}
		}
		
		System.out.println();
		System.out.println("检查 list数组里的情况： "+list.toString());
		
		
		ArrayList<Integer> newList=new ArrayList<>();
		
		int[] countArray=new int[1000];
		
		for(int j=0; j<list.size(); j++) {
			if(!newList.contains(list.get(j))) {
				newList.add(list.get(j));
				countArray[list.get(j)]++;
			}
			else {
				countArray[list.get(j)]++;
			}
		}
		
		System.out.println("检查 newList数组里的情况： "+newList.toString());
		System.out.println();
		
		//先定义 N 为 1
		int n=1;
		for(int j=0; j<newList.size(); j++) {
			//不能将2整除的是奇数
			if(countArray[newList.get(j)] % 2 != 0 ) {
				n = n*newList.get(j) ;
			}
		}
		
		//输出 N ：是列表中出现奇数次的因子的乘积
		System.out.println("The smallest number m*n to "
				+ "be a perfect square is " + n);
		
		
		System.out.println(" m*n is " + m*n);
	}

}
