package day14.quesion1;
import java.util.Scanner;
 
public class AccountDemo {
	
	 public static void main(String[] args) {
 
		Account account=new Account("sfdf");
		account.deposit(5000);
		try {
		double balance=account.withdraw(45000);
         System.out.println("Remaining balnce in your account is "+balance);
		}
		catch(InsufficientFundsException ifs) {
			System.out.println(ifs.getMessage());
		}

	}
}
