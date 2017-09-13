
public class Checking extends Bank {
	
	private static int apple = 0;
	private double money; 
	
	public Checking (double money, int account) {
		super (money, account);	
	}
	
	public void withdraw (double withdraw) {
		apple ++;
		if (apple > 3) {
			money = money - 1;
		}
		super.withdraw(withdraw);		
	}

	public double monthEnd() {
		apple = 0;
		return money;
	}
}
