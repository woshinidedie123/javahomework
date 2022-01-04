package p11;

import java.util.Date;
public class Transaction {

	private java.util.Date date;
	
	//�������ͣ�����'W','D'
	private char type;
	
	//������
	private double amount;
	
	//���׺�������
	private double balance;
	
	//��������
	private String description;
	
	
	//һ���вι��췽��
	public Transaction(char type, double amount, double balance, String description, Date date) {
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
		
		//����һ����������
		date=new Date();
		this.date=date;
	}
	
	//��ý�������
	public String getDate() {
		return date.toString();
	
	}
	
	//���ý�������
	public void setDate(long eclapseTime) {
		date.setTime(eclapseTime);
	}
	
	//�������ͣ���W������ȡ���D���������
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
