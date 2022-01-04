package chapter8;

import java.util.Scanner;

public class class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. ����������ʼ��һ��int���󣬴ӿ���̨��ȡ�û���������ֲ���ֵ
        int user_input = 0;
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        user_input = input.nextInt();
        //2. ������������һ��int�����顢һ��String�����飬����Ϊ3 * 3
        int[][] bin = new int[3][3];
        String[][] str = new String[3][3];
        //3. ����������dint�Ͷ������Զ��巽��dec_to_bin��ʮ����ת�����ƣ�������dint�����������շ���ֵ
        bin = dec_to_bin(user_input);
        //4. ����������������鴫���Զ��巽��bin_to_state��String��������շ���ֵ
        str = bin_to_state(bin);
        //5. �������������String���������
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3; j++){
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] dec_to_bin(int num){
        //�������ʮ������תΪ���������󷵻�
        int[][] arr = new int[3][3];
        for (int i = 2 ; i >= 0 ; i--){
            for (int j = 2 ; j >= 0 ; j--){
                arr[i][j] = (num % 2);
                num /= 2;
            }
        }
        return arr;
    }
    public static String[][] bin_to_state(int[][] arr){
        //������Ķ���������תΪ��Ӧ��String���飨0����H 1����T��
        String[][] str = new String[3][3];
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                if (arr[i][j] == 0){
                    str[i][j] = "H";
                }else
                    str[i][j] = "T";
            }
        }
        return str;
	}

}
