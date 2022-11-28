package com.jspiders.atm.app;

public class ATM {

	private double balance;
	private double depositAmmount;
	private double withdrawAmmount;
	
	public ATM() {
		super();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getDepositAmmount() {
		return depositAmmount;
	}

	public void setDepositAmmount(double depositAmmount) {
		this.depositAmmount = depositAmmount;
	}

	public double getWithdrawAmmount() {
		return withdrawAmmount;
	}

	public void setWithdrawAmmount(double withdrawAmmount) {
		this.withdrawAmmount = withdrawAmmount;
	}
	
	
	
}
