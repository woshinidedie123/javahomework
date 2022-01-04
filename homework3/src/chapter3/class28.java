package chapter3;

import java.util.Scanner;

public class class28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        System.out.println("Enter r1's center x-. y- coordinates, width, and height: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double w1 = input.nextDouble(), h1 = input.nextDouble();
        System.out.println("Enter r2's center x-, y- coordinates, width, and height: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double w2 = input.nextDouble(), h2 = input.nextDouble();


        double x0 = Math.abs(x2 - x1);
        double y0 = Math.abs(y2 - y1);


        if(((x0 + w2 / 2) <= (w1 / 2)) && ((y0 + h2 / 2) <= (h1 / 2))) {
            System.out.println("r2 is inside r1");
        }else if(((w1 - w2) / 2) < x0 && x0 < ((w1 + w2) / 2) && ((h1 - h2) / 2) < y0 && y0 < ((h1 + h2) / 2))
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlap r1");
	}

}
