package p11;

import java.util.ArrayList;
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewAccount object=new NewAccount("George", 1122, 1000);  
		object.setAnnualInterestRate(0.015);
		
		object.deposit(30);
		object.deposit(40);
		object.deposit(50);
		
		object.withDraw(5);
		object.withDraw(4);
		object.withDraw(2);
		
		System.out.println("�˻����������֣� "+object.getName()
					+ "\n����: "+object.getAnnualInterestRate()
					+ "\n��֧� "+object.getBalance()
					+ "\n���еĽ���:"+object.toString());
	}

}
