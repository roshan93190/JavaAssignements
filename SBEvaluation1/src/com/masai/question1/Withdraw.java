package com.masai.question1;

	public class Withdraw implements Runnable {
		 int amount;
		 Account account;
		public Withdraw(Account aBC, int i) {
			// TODO Auto-generated constructor stub
			// TODO Auto-generated method stub
			this.amount=i;
			this.account=aBC;
		}
		@Override
		public void run() {
			account.withdraw(amount);
			
			  
		
		 
		 
		}
		
		 
	}
