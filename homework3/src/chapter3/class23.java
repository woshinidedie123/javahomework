package chapter3;

import java.util.Scanner;

public class class23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();


        double x0 = -2.5, x1 = 2.5;    
        double y0 = -5.0, y1 = 5.0;  


        boolean boolX = false,boolY = false;
        if(x2 >= x0 && x2 <= x1)
            boolX = true;
        if(y2 >= y0 && y2 <= y1)
            boolY = true;


        boolean bool = (boolX && boolY)? true : false;


        if(bool){
            System.out.println("Point (" + x2 + ", " +  y2 + ") is in the rectangle");
        }else{
            System.out.println("Point (" + x2 + ", " +  y2 + ") is not in the rectangle");
        }
	}

}
