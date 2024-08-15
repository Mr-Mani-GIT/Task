package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Bank Name : Axis Bank");

	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
		a.fixed();
		a.saving();
	}
}
