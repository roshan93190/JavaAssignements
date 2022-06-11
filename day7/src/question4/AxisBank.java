package question4;

		public class AxisBank extends Bank {
		
			double rateOfInterest;
			
		 @Override
		 public void displayDetails() {
			System.out.println("YourBranch name is:"+this.branchName); 
			System.out.println("Your ifscCode i s:"+this.ifscCode); 
			System.out.println("Your rate of interest is :"+this.rateOfInterest); 
			 
		 }
			
		 void getCreditCard() {
			 System.out.println("Get the credit card from the Axis Bank");
			 
		 }
		 
		}
