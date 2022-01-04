package chapter3;

import java.util.Scanner;

public class class27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point's x- and y- coordinates: ");
        double x_judge = input.nextDouble(), y_judge = input.nextDouble();


        boolean bool = true;

        if( (x_judge < 0 || x_judge > 200) || (y_judge < 0 || y_judge > 100) ) {
            bool = false;
        }

        double k = 100.0 / (0 - 200);
        double b_judge = y_judge - k * x_judge;
        if(b_judge < 0 || b_judge > 100)
            bool = false;

        if(bool)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
	}

}
