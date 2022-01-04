package chapter5;

import java.util.Scanner;

public class class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines = input.nextInt();

        for (int n = 1; n <= lines;n++){
            if(lines != n){
                for (int a = 1; a <= (lines - n); a++)
                    System.out.print("  ");
            }

            for (int b = n; b > 0 ; b--)
                System.out.printf("%d ",b);;

            if(n >= 2) {
                for (int c = 2; c <= n; c++)
                    System.out.printf("%d ", c);;
            }

            System.out.println();
        }
        input.close();
	}

}
