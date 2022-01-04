package p11;
import java.util.ArrayList;
import java.util.Date;

public class NewAccount {

	private String name;
	
	//用于为账户存储交易
	private ArrayList<Object> transactions=new ArrayList<>();
	
	public int id=0;//用户名
	public double balance=0;//余额
	public double annualInteresRate=0;//当前利率
	public java.util.Date dateCreated;//存储开户日期
	
	//无参构造方法
	public NewAccount() {
		Date dateCreated=new Date();
		this.dateCreated=dateCreated;
		
	}
	
	//有参构造方法
	public NewAccount(int id, double balance){
		Date dateCreated=new Date();
		this.dateCreated=dateCreated;
		this.id=id;
		this.balance=balance;
	}
	
	//一个新的有参构造方法
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
	
	
	//取钱
	public double withDraw(double withDarw) {
		
		//创建一笔取钱交易
		Transaction withDrawTransacte=new Transaction('W', withDarw, (this.balance=this.balance-withDarw), "取款："+withDarw+"美元", dateCreated);
		transactions.add(withDrawTransacte.getDescription());
		
		return this.balance;
		
	}
	
	
	//存钱
	public double deposit(double deposit) {
		//创建一笔存钱交易
		Transaction depositTransacte=new Transaction('D', deposit, (this.balance=this.balance+deposit), "存款："+deposit+"美元", dateCreated);
		transactions.add(depositTransacte.getDescription());	
		
		return this.balance;
	}
	
	public String toString() {
		return "\n日期： "+getDateCreated()+"\n"+transactions.toString();
		
	}
}
