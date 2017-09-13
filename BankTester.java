import java.util.Scanner;

public class BankTester {
	
	public static void main (String[] args) {
		Scanner scnr = new Scanner (System.in);
		System.out.print("Number of Accounts: ");
		int num = scnr.nextInt();
		int account;
		int amount;
		Bank[] bank = new Bank[num];
		for (int i = 0; i < num; i ++) {
			System.out.print("Type of Account: (S)avings or (C)hecking");
			String type = scnr.next();
			if (type.equalsIgnoreCase("S")) {
				System.out.print("Account Number: ");
				account = scnr.nextInt();
				System.out.print("Amount of Money: ");
				amount = scnr.nextInt();
				bank[i] = new Saving(amount, account);
			}
			if (type.equalsIgnoreCase("C")) {
				System.out.print("Account Number: ");
				account = scnr.nextInt();
				System.out.print("Amount of Money: ");
				amount = scnr.nextInt();
				bank[i] = new Checking(amount, account);
			}
			if (type.equalsIgnoreCase("Winnie")) {
				System.out.print("Winnie is a Meanie ");
		
			}	
			
		}
		int d;
		int w;
		int m;
		int q = 0;
		while (q == 0) {
			System.out.println("(D)eposit (W)ithdraw (M)onthEnd (Q)uit ");
			String Action = scnr.next();
			if (Action.equalsIgnoreCase ("W")) {
				System.out.println 	("Amount of Money: ");
				amount = scnr.nextInt ();
	
			}
			if (Action.equalsIgnoreCase ("D")) {
				System.out.println 	("Amount of Money: ");
				amount = scnr.nextInt ();
	
			}	
			if (Action.equalsIgnoreCase ("M")) {
				System.out.println 	("");
	
			}
			if (Action.equalsIgnoreCase ("Q")) {

	
			}
		}
		
	}
}
	
	