package com.masai.question1;

	public class Main {
	public static void main(String[] args) {
		Account ABC = new Account();
		ABC.balance = 1000;

		System.out.println("sdfsdf");

		Deposit deposit = new Deposit(ABC, 500);
		Withdraw withdraw = new Withdraw(ABC, 900);
		Thread thread1 = new Thread(deposit);
		Thread thread2 = new Thread(withdraw);
		thread1.start();
		thread2.start();
	}
	}