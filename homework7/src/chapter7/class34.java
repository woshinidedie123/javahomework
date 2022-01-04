package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class class34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 主方法：新建一个字符串对象，提示用户输入一个字符串
        String str = "";
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        //2. 主方法：接收用户输入，String接收
        str = input.nextLine();
        //3. 主方法：调用方法sort，并将字符串传入，使用原字符串对象接收
        str = sort(str);
        //4. 主方法：输出字符串对象
        System.out.print(str);
    }
    public static String sort(String s){
        //5. sort方法：获取字符串长度，赋值给length
        int length = s.length();
        //6. sort方法：新建一个char型数组，长度为length
        char[] ch = new char[length];
        //7. sort方法：遍历字符串（charAt()），将字符串的每个字符传递给char型数组
        for ( int i = 0 ; i < length ; i++){
            ch[i] = s.charAt(i);
        }
        //8. sort方法：对数组进行排序（Arrays.sort()）
        Arrays.sort(ch);
        //9. sort方法：对数组进行遍历，每个元素加到字符串中，返回字符串
        String str = "";
        for (int i = 0 ; i < length ; i++){
            str += ch[i];
        }
        return str;
	}

}
