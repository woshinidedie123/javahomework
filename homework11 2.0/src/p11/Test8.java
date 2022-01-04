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
		
		System.out.println("账户持有者名字： "+object.getName()
					+ "\n利率: "+object.getAnnualInterestRate()
					+ "\n收支额： "+object.getBalance()
					+ "\n所有的交易:"+object.toString());
	}

}
