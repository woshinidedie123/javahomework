package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class class18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. ������������һ������
        double[] list = new double[10];
        //2. ����������ȡdouble��ֵ��������Щֵ�����������
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("������10��double��ֵ��");
        for (int i = 0; i < 10 ; i++){
            list[i] = input.nextDouble();
        }
        //3. �������������Զ��巽��bubble������ոո�ֵ������飬��������õ�����
        list = bubble(list);
        //4. ��������������յ�����
        System.out.print(Arrays.toString(list));
    }
    //5. bubble���������������ð������
    public static double[] bubble(double[] list){
        //1. ��ȡlist���ȣ�������ʱ�洢����temp
        int length = list.length;
        double temp = 0;
        //2. ˫�����list�����ǰһ��ֵ>��һ��ֵ�򽻻�������ֵ
        for (int a = 0 ; a < length - 1 ; a++){
            for (int i = 0 ; i < length - 1 ; i++){
                if (list[i] > list[i+1]){
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }
        //3. ����list����
        return list;
	}

}
