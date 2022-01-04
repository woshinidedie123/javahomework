package p11;
import java.util.ArrayList;
import java.util.Date;

public class NewAccount {

	private String name;
	
	//����Ϊ�˻��洢����
	private ArrayList<Object> transactions=new ArrayList<>();
	
	public int id=0;//�û���
	public double balance=0;//���
	public double annualInteresRate=0;//��ǰ����
	public java.util.Date dateCreated;//�洢��������
	
	//�޲ι��췽��
	public NewAccount() {
		Date dateCreated=new Date();
		this.dateCreated=dateCreated;
		
	}
	
	//�вι��췽��
	public NewAccount(int id, double balance){
		Date dateCreated=new Date();
		this.dateCreated=dateCreated;
		this.id=id;
		this.balance=balance;
	}
	
	//һ���µ��вι��췽��
	public NewAccount(String name, int id, double balance) {
		Date dateCreated=new Date();
		this.dateCreated=dateCreated;
		this.id=id;
		this.balance=balance;
		this.name=name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInteresRate=annualInterestRate;
	}
	
	public int getId() {
		return id;
	
	}
	
	public double getBalance() {
		return balance;
	
	}
	
	public String getName() {
		return name;
		
	}
	
	public double getAnnualInterestRate() {
		return annualInteresRate;
	
	}
	
	public double getMonthlyInterestRate() {
		return annualInteresRate/12;
	
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	
	}
	
	
	//ȡǮ
	public double withDraw(double withDarw) {
		
		//����һ��ȡǮ����
		Transaction withDrawTransacte=new Transaction('W', withDarw, (this.balance=this.balance-withDarw), "ȡ�"+withDarw+"��Ԫ", dateCreated);
		transactions.add(withDrawTransacte.getDescription());
		
		return this.balance;
		
	}
	
	
	//��Ǯ
	public double deposit(double deposit) {
		//����һ�ʴ�Ǯ����
		Transaction depositTransacte=new Transaction('D', deposit, (this.balance=this.balance+deposit), "��"+deposit+"��Ԫ", dateCreated);
		transactions.add(depositTransacte.getDescription());	
		
		return this.balance;
	}
	
	public String toString() {
		return "\n���ڣ� "+getDateCreated()+"\n"+transactions.toString();
		
	}
}
