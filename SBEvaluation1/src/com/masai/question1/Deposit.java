package com.masai.question1;

		public class Deposit implements Runnable {
			 int amount;
			 Account account;
			@Override
			public void run() {
				// TODO Auto-generated method stub
//				account.balance+=amount;
				account.deposit(amount);
			}
			Deposit(Account account,int amount){
				this.account=account;
				this.amount=amount;
			}
		}