package org.bank;

public class BankInfo {
	public void saving() {
		System.out.println("Savings is the main operation of bank");
	}

	public void fixed() {
		System.out.println("Fixed Interest is part of one Interest");
	}
	
	public void deposit(int i) {
		System.out.println("Deposit is main function of bank" + i);
	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit(34);
		
	}
}
