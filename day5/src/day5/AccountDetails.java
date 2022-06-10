		package day5;
		 import java.util.Scanner;
		public class AccountDetails {
		
			
			public   Account getAccountDetails() {
			
			Scanner input =new Scanner(System.in);
			Account ac=new Account();
			 	
				 
				
				System.out.println("Enter account id");
				
				int id=input.nextInt();
				ac.setAccountId(id);
				
				
				System.out.println("Enter account type");
				String type=input.next();
				ac.setAccountType(type);
				
				System.out.println("enter balance");
				int balance=input.nextInt();
				ac.setAccountId(balance);
				
				if(balance<=0) {
					System.out.println("Amount should be positive:"+balance);
				  getAccountDetails();
				  return ac;
				}
				
				else {
					ac.setBalance(balance); 			
				return ac;
				}
			}
			
			public int  getWithdrawAmount() {
		Scanner input=new Scanner(System.in);
			
		System.out.println("amount to be withdrawn");
		int amount=input.nextInt();
		if(amount<=0) {
			System.out.println("Withdrawn amount should be positive");
			getAccountDetails();
			return amount;
		}
		else {
			return amount;
		}
				
				
				
			}
		 
		
			public static void main(String[] args) {
		//		 TODO Auto-generated method stub
				AccountDetails account=new AccountDetails();
				Account ac=account.getAccountDetails();
			
				int amount =account.getWithdrawAmount();
				ac.withdraw(amount);
			}
		
		}
		


//Create a class AccountDetails with main function and the below methods :
//public Account getAccountDetails() - This methods gets the input related to Account
//from the user and returns the Account object with all values set. If the input given for
//balance is less than or equal to zero, consider it as invalid and display "Balance
//should be positive". Continue this kind of evaluation till user enters a positive value.
//public int getWithdrawAmount() - This methods gets the amount to be withdrawn as
//input from the user and returns the same. If the input given for amount is less than
//or equal to zero, consider it as invalid and display "Amount should be positive".
//Continue this kind of evaluation till user enters a positive value.
//
