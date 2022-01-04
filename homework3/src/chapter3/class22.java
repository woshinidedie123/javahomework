package chapter3;

import java.util.Scanner;

public class class22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        double x1 = 0.0, y1 = 0.0;
        double distance = Math.pow( (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)), 0.5);

        double radius = 10.0;

        final double EPSILON = 0.001;
        boolean bool = false;
        if((radius - distance) > EPSILON){
            bool = true;
        }


        if(bool){
            System.out.println("Point (" + x2 + ", " +  y2 + ") is in the circle");
        }else{
            System.out.println("Point (" + x2 + ", " +  y2 + ") is not in the circle");
        }
	}

}
