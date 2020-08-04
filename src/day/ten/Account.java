package day.ten;

public class Account{
	
	// 帐号
	private String accountNum;
	// 帐户名
	private String accountName;
	// 余额
	public double money;
	
	
	public Account() {
		super();
	}
	public Account(String accountNum, String accountName, double money) {
		super();
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.money = money;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	
	
}