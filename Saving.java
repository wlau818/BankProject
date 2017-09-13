
public class Saving extends Bank {
	
	private double money; 
	
	public Saving (double money, int account) {
		super (money, account);
		this.money  = money;
	}
	
	public double monthEnd() {
		money = money + (money * 0.02);
		return money;
	}

}
