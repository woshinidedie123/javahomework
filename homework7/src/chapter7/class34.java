package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class class34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. ���������½�һ���ַ���������ʾ�û�����һ���ַ���
        String str = "";
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("������һ���ַ�����");
        //2. �������������û����룬String����
        str = input.nextLine();
        //3. �����������÷���sort�������ַ������룬ʹ��ԭ�ַ����������
        str = sort(str);
        //4. ������������ַ�������
        System.out.print(str);
    }
    public static String sort(String s){
        //5. sort��������ȡ�ַ������ȣ���ֵ��length
        int length = s.length();
        //6. sort�������½�һ��char�����飬����Ϊlength
        char[] ch = new char[length];
        //7. sort�����������ַ�����charAt()�������ַ�����ÿ���ַ����ݸ�char������
        for ( int i = 0 ; i < length ; i++){
            ch[i] = s.charAt(i);
        }
        //8. sort�������������������Arrays.sort()��
        Arrays.sort(ch);
        //9. sort��������������б�����ÿ��Ԫ�ؼӵ��ַ����У������ַ���
        String str = "";
        for (int i = 0 ; i < length ; i++){
            str += ch[i];
        }
        return str;
	}

}
