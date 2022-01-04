package chapter5;

import java.util.Scanner;

public class class29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.println("输入年份和代表该年第一天是周几的数字");
        int year = input.nextInt();
        int day = input.nextInt();

        String str1 = "";
        String str2 = "";
        for (int month = 1; month <= 12 ; month++){
  
            switch (month){
                case 1: {str1 += "January 1, ";} break;
                case 2: {day += 31; str1 += "Febuary 1, ";} break;
                case 3: {day += 28; str1 += "March 1, ";} break;
                case 4: {day += 31; str1 += "April 1, ";} break;
                case 5: {day += 30; str1 += "May 1, ";} break;
                case 6: {day += 31; str1 += "June 1, ";} break;
                case 7: {day += 30; str1 += "July 1, ";} break;
                case 8: {day += 31; str1 += "Auguest 1, ";} break;
                case 9: {day += 31; str1 += "September 1, ";} break;
                case 10: {day += 30; str1 += "November 1, ";} break;
                case 11: {day += 31; str1 += "December 1, ";} break;
                case 12: {day += 30; str1 += "October 1, ";}
            }

            if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0) && (year % 100 == 0))){
                if (month != 1)
                    day +=1;
            }

            int week = day % 7;
            switch (week){
                case 1:str2 = " is Monday";break;
                case 2:str2 = " is Tuesday";break;
                case 3:str2 = " is Wednesday";break;
                case 4:str2 = " is Thurday";break;
                case 5:str2 = " is Friday";break;
                case 6:str2 = " is Saturday";break;
                case 0:str2 = " is Sunday";break;
            }

            System.out.println(str1 + year + str2);
            str1 = "";
            str2 = "";
        }
	}

}
