package p11;

import java.util.ArrayList;
import java.util.Scanner;
public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		//����һ�������б������桰���ӡ�
		ArrayList<Integer> list=new ArrayList<>();
		
		
		System.out.print("Enter an integer m: ");
		

		int number=input.nextInt();
		input.close();
		
		//�õ� M
		int m=number;
		
		int i=2;
		
		System.out.print("����Ϊ�� ");
		
		while(number != 1) {
			if(number % i ==0) {
				number = number / i ;
				System.out.print( i + " ");//�������
				list.add(i);
			}
			else {
				i++;
			}
		}
		
		System.out.println();
		System.out.println("��� list������������ "+list.toString());
		
		
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
		
		System.out.println("��� newList������������ "+newList.toString());
		System.out.println();
		
		//�ȶ��� N Ϊ 1
		int n=1;
		for(int j=0; j<newList.size(); j++) {
			//���ܽ�2������������
			if(countArray[newList.get(j)] % 2 != 0 ) {
				n = n*newList.get(j) ;
			}
		}
		
		//��� N �����б��г��������ε����ӵĳ˻�
		System.out.println("The smallest number m*n to "
				+ "be a perfect square is " + n);
		
		
		System.out.println(" m*n is " + m*n);
	}

}
