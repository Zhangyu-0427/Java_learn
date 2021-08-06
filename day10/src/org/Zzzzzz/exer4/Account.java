package org.Zzzzzz.exer4;

public class Account {

	private double balance;
	
	public Account(double init_balance){
		this.balance = init_balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double amt){
		if(amt > 0){
			balance += amt;
			System.out.println("存款成功!");
		}
	}
	
	public void withdraw(double amt){
		if((balance - amt) < 0){
			System.out.println("余额不足!");
			return;
		}
		balance -= amt;
		System.out.println("取款成功!");
	}
	
}
