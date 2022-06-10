package day5.question3;
import java.util.Scanner;
public class AccountDetails {
//	Account ac=new Account();
	public Account getAccountDetails(){
		Account ac=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account id");
		int accountId=sc.nextInt();
        ac.setAccountId(accountId);
		System.out.println("Enter account type");
		String accountype=sc.nextLine();
		sc.nextLine();
		ac.setAccountType(accountype);
		System.out.println("Enter amount balance");
		int balance=sc.nextInt();
		ac.setBalance(balance);
		if(balance<=0) {
			System.out.println("Balance should be positive");
			getAccountDetails();
			
			return ac;
		}
		else {
			ac.setBalance(balance);
			return ac;
		}
		
	}
	public int getWithdrawlAmount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount you want to withdraw");
		
		int b=sc.nextInt();
		if(b<=0) {
			System.out.println("amount should be positive");
			getWithdrawlAmount();
			return 0;
		}
		else {
			return b;		
		}

	
		
	}
	
	public static void main(String[] args) {
		AccountDetails accountDetails=new AccountDetails();
		  accountDetails.getAccountDetails();
		  accountDetails.getWithdrawlAmount();
		 
	    
	}
}

/*In the first round of HR interview for a banking sector,  HR decides to make candidates
design an application which provides only  information on transaction like amount
withdrawn with respect to fields given. Develop a program to implement this scenario.
Create a class Account with the private attributes:
accountId int
accountType String
balance int
The method public boolean withdraw(int) used  to calculate the current balance of the
respective account. Before that it should enough balance.  If there is enough balance,
deduct the amount from the balance and print "Balance amount after withdraw: XXX"
and return true.  If there is no enough balance, print "Sorry!!! No enough balance" and
return false.
Create a class AccountDetails with main function and the below methods :
public Account getAccountDetails() - This methods gets the input related to Account
from the user and returns the Account object with all values set. If the input given for
balance is less than or equal to zero, consider it as invalid and display "Balance
should be positive". Continue this kind of evaluation till user enters a positive value.
public int getWithdrawAmount() - This methods gets the amount to be withdrawn as
input from the user and returns the same. If the input given for amount is less than
or equal to zero, consider it as invalid and display "Amount should be positive".
*/
