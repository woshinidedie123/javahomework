
public class TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle[] circleArray;
        
        circleArray=createCircleArray();
        
        printCircleArray(circleArray);
	}

	public static void printCircleArray(Circle[] circleArray) {
		// TODO Auto-generated method stub
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
		}
	}

	public static Circle[] createCircleArray() {
		// TODO Auto-generated method stub
		Circle[] circleArray=new Circle[5];
		
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new Circle(Math.random()*100);
		}
		
		return circleArray;
	}
}
