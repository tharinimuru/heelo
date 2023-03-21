package org.bank;

public class AxisBank extends BankInfo{
public void deposit(int i) {

	System.out.println("Hello" + i);
	super.deposit(20);
}
public void deposit() {
	System.out.println("DEPOSIT");
}

public static void main(String[] args) {
	BankInfo b = new AxisBank();
	b.deposit(40);
	AxisBank a = new AxisBank();
	a.deposit();
}
}

// Editerd by kabir
