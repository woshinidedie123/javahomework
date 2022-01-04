package chapter3;

import java.util.Scanner;

public class class21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.println("Enter month: 1-12 : ");
        int m = input.nextInt(); 
        System.out.println("Enter the day of the month:1-31 : ");
        int q = input.nextInt();

        
        if(m == 1 || m == 2){
            m += 12;
            year -= 1;
        }
        int k = year % 100;
        int j = year / 100;


        int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;


        String str;
        switch (h){
            case 0:str = "Saturday";break;
            case 1:str = "Sunday";break;
            case 2:str = "Monday";break;
            case 3:str = "Tuesday";break;
            case 4:str = "Wednesday";break;
            case 5:str = "Thursday";break;
            default:str = "Friday";
        }
	}

}
