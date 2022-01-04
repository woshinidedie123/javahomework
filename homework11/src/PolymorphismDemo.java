
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        displayObject(new Circle(1,"red",false));
        displayObject(new Rectangle(1,1,"black",true));
	}

	private static void displayObject(GeometricObject object) {
		// TODO Auto-generated method stub
		System.out.println("Created on "+object.getDateCreated()+".Color is"+object.getColor());
	}

}
