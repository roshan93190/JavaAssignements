package day14.quesion1;

		public class Account {
			 public String acountNumber;
			 public double balance;
			 
			 
			public Account(String AccountNumber){
				 this.acountNumber=AccountNumber;
			 }
			 
			 public void deposit(int amount) {
				 this.balance+=amount;
			 }
			 public double withdraw(int amount) throws InsufficientFundsException {
				 
				 if(this.balance>=amount) {
					 this.balance-=amount;
				 }
				 else {
					 InsufficientFundsException ife=new InsufficientFundsException("insufficient balance in your account");
					 throw ife;
				 }
				 
				 
				 
				 
				 return balance;
			 }
			 
			 
			 
		}
