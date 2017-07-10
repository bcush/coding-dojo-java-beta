package com.codingdojo.bankaccount;

public class BankAccount {
	private String accountNum;
	private long checkingBal;
	private long savingsBal;
	private static int numberOfAccounts;
	private static long totalAmount;
	
	private static long randomAccountNum() {
		long num = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		return num;
	}
	
	public BankAccount () {
		accountNum = String.valueOf(randomAccountNum());
		numberOfAccounts++;
	}

	public long getCheckingBal() {
		return checkingBal;
	}

	public long getSavingsBal() {
		return savingsBal;
	}
	
	public long getTotal() {
		return (checkingBal + savingsBal);
	}
	
	public void depositMoney (String account, long amount) {
		if (account == "savings") {
			savingsBal += amount;
			totalAmount += amount;
			System.out.println("Deposited " + amount + "into savings.");
		}
		if (account == "checking") {
			checkingBal += amount;
			totalAmount += amount;
			System.out.println("Deposited " + amount + "into checking.");
		}
	}
	
	public void withdrawMoney (String account, long amount) {
		if (account == "savings") {
			savingsBal -= amount;
			totalAmount -= amount;
			System.out.println("Withdrew " + amount + "from savings.");
		}
		if (account == "checking") {
			checkingBal -= amount;
			totalAmount -= amount;
			System.out.println("Withdrew " + amount + "from checking.");
		}
	}
}
