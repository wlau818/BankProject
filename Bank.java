
public class Bank {	
	
	private double money = 0;
	private int accountNum;
	
	public Bank(double money, int account) {
		this.money = money;
		accountNum = account;
	}
	
	public void makeDeposit(double deposit) {
		money = money + deposit;
		System.out.println("$" + money);
	}
	
	public void withdraw (double withdraw) {
		money = money - withdraw;
		System.out.println("$" + money);
	}
	
	public double getMoney () {
		return money;
	}
	
	public int getAccount() {
		return accountNum;
	}
}
