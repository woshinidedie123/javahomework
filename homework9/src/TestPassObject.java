
public class TestPassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle myCircle=new Circle(1);
        
        int n=5;
        printAreas(myCircle,n);
        
        System.out.println("\n"+"Radius is "+myCircle.getRadius());
        System.out.println("n is "+n);
	}

	private static void printAreas(Circle c, int times) {
		// TODO Auto-generated method stub
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}

}
