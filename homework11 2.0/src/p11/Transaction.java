package p11;

import java.util.Date;
public class Transaction {

	private java.util.Date date;
	
	//交易类型，例如'W','D'
	private char type;
	
	//交易量
	private double amount;
	
	//交易后的新余额
	private double balance;
	
	//交易描述
	private String description;
	
	
	//一个有参构造方法
	public Transaction(char type, double amount, double balance, String description, Date date) {
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
		
		//创建一个交易日期
		date=new Date();
		this.date=date;
	}
	
	//获得交易日期
	public String getDate() {
		return date.toString();
	
	}
	
	//设置交易日期
	public void setDate(long eclapseTime) {
		date.setTime(eclapseTime);
	}
	
	//交易类型：‘W’——取款，‘D’——存款
	public char getType() {
		return type;
	
	}
	
	public void setType(char type) {
		this.type=type;
	}
	
	public double getAmount() {
		return amount;
	
	}
	
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	public double getBalance() {
		return balance;
	
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public String getDescription() {
		return description;
	
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
}
