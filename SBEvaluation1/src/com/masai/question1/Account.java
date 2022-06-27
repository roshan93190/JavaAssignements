	package com.masai.question1;
	
	public class Account {
		
		int balance;
		int accountNumber;
		public void displayBalance() {
			System.out.println("your current balance is: "+this.balance);
		}
		public void deposit(int amount) {
					
			balance+=amount;
			System.out.println("Amount deposited: "+amount);
			displayBalance();
				}
				
		public void withdraw(int amount) {
			balance-=amount;
			System.out.println("amount withdrawn: "+amount);
			displayBalance();
		}

	}
